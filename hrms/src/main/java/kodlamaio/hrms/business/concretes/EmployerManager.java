package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.helpers.GetEmailVerify;
import kodlamaio.hrms.core.helpers.GetSystemVerify;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Repository
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(), "İşverenler listelendi."); 
	}
	@Override
	public Result add(Employer employer) {
		if(GetEmailVerify.Run()) {
			if(GetSystemVerify.Run()) {
				this.employerDao.save(employer);
				return new SuccessResult("İşveren eklendi.");

			}
			else {
				return new ErrorResult("Sistem doğrulaması başarısız oldu.İşveren kaydedilemedi.");
			}
		}
		else {
			return new ErrorResult("Email doğrulaması başarısız oldu.İşveren kaydedilemedi.");
		}
			}
	@Override
	public DataResult<Employer> findByEmailAddress(String email) {
		var sonuc=this.employerDao.findByEmailAddress(email);
		if(sonuc != null) {
			return new SuccessDataResult<Employer>
			(this.employerDao.findByEmailAddress(email),"Bu email adresi sistemde mevcut");
		}
		else {
			return new ErrorDataResult<Employer>(null,"Bu mail adresi sistemde mevcut değil."); 
		}
	}

}
