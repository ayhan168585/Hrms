package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.business.abstracts.SystemVerificationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SystemVerificationDao;
import kodlamaio.hrms.entities.concretes.SystemVerification;

@Repository
public class SystemVerificationManager implements SystemVerificationService{

	private SystemVerificationDao systemVerificationDao;
	@Autowired
	public SystemVerificationManager(SystemVerificationDao systemVerificationDao) {
		super();
		this.systemVerificationDao = systemVerificationDao;
	}

	@Override
	public DataResult<List<SystemVerification>> getAll() {
		return new SuccessDataResult<List<SystemVerification>>
		(this.systemVerificationDao.findAll(),"Sistem onayları listelendi");
	}

	@Override
	public Result add(SystemVerification systemVerification) {
		this.systemVerificationDao.save(systemVerification)
		return new SuccessResult("Yeni sistem onayı eklendi.");
	}

}
