package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.helpers.GetEmailVerify;
import kodlamaio.hrms.core.helpers.GetMernisVerify;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.dtos.JobSeekerWithJobPositionDto;

@Repository
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>
		(this.jobSeekerDao.findAll(),"İş arayanlar listelendi.");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		if(GetMernisVerify.Run()) {
			if(GetEmailVerify.Run()) {
				this.jobSeekerDao.save(jobSeeker);
				return new SuccessResult("Yeni iş arayan eklendi.");
			}
			else {
				return new ErrorResult("Email doğrulaması başarısız oldu.İş arayan kaydedilemedi.");
			}
			
		}
		else {
			return new ErrorResult("Mernis doğrulaması başarısız oldu.İş arayan kaydedilemedi.");
		}
		
	}

	@Override
	public DataResult<JobSeeker> findByEmailAddress(String email) {
		
		var sonuc=this.jobSeekerDao.findByEmailAddress(email);
		if(sonuc != null) {
			return new SuccessDataResult<JobSeeker>
			(this.jobSeekerDao.findByEmailAddress(email),"Bu email adresi sistemde mevcut");
		}
		else {
			return new ErrorDataResult<JobSeeker>(null,"Bu mail adresi sistemde mevcut değil."); 
		}
		
		
	}

	@Override
	public DataResult<JobSeeker> findByTcNo(String tcNo) {
		// TODO Auto-generated method stub
		var sonuc=this.jobSeekerDao.findByTcNo(tcNo);
		if(sonuc != null) {
			return new SuccessDataResult<JobSeeker>
			(this.jobSeekerDao.findByTcNo(tcNo),"Bu TC Numarası sistemde mevcut");
		}
		else {
			return new ErrorDataResult<JobSeeker>(null,"Bu TC Numarası sistemde mevcut değil."); 
		}
	}

	@Override
	public DataResult<List<JobSeekerWithJobPositionDto>> getJobSeekerWithJopPositionDetails() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeekerWithJobPositionDto>>
		(this.jobSeekerDao.getJobSeekerWithJopPositionDetails(),"İş arayanın iş pozisyon detayı listelendi.");
	}

	

	

}
