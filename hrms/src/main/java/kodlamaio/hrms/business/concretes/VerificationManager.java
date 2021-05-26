package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.business.abstracts.VerificationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.VerificationDao;
import kodlamaio.hrms.entities.concretes.Verification;

@Repository
public class VerificationManager implements VerificationService {

	private VerificationDao verificationDao;
	@Autowired
	public VerificationManager(VerificationDao verificationDao) {
		super();
		this.verificationDao = verificationDao;
	}

	@Override
	public DataResult<List<Verification>> getAll() {
		return new SuccessDataResult<List<Verification>>
		(this.verificationDao.findAll(),"Onaylamalar listelendi.");
	}

	@Override
	public Result add(Verification verification) {
		this.verificationDao.save(verification);
		return new SuccessResult("Yeni onaylama eklendi.");
	}

}
