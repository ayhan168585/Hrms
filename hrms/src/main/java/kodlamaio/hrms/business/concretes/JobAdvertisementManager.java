package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Repository
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;
	private UserDao userDao;
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao, UserDao userDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
		this.userDao = userDao;
	}

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		// TODO Auto-generated method stub
		
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(),"İş ilanları listelendi.");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		// TODO Auto-generated method stub
		
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new ErrorResult("Yeni iş ilanı eklendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable=PageRequest.of(pageNo-1, pageSize);
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(pageable).getContent(),"İş ilanları listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByCompanyName(int userId,boolean isActive) {
		// TODO Auto-generated method stub
		isActive=true;
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByCompanyName(userId,isActive),"Seçtiğiniz firmaya ait aktif iş ilanları listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllByIsActive(boolean isActive) {
		// TODO Auto-generated method stub
		isActive=true;
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getAllByIsActive(isActive),"Tüm aktif iş ilanları listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSorted() {
		// TODO Auto-generated method stub
		Sort sort=Sort.by(Sort.Direction.DESC,"applicationDeadline");
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(sort),"İş ilanları tarihe göre listelendi.");
	}

	@Override
	public DataResult<JobAdvertisement> getByJobAdvertisementId(int jobAdvertisementId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<JobAdvertisement>
		(this.jobAdvertisementDao.getByJobAdvertisementId(jobAdvertisementId),"Seçtiğiniz iş ilanının ayrıntısı listelendi.");
	}

}
