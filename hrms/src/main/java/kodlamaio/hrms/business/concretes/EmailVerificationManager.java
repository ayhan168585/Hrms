package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.business.abstracts.EmailVerificationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmailVerificationDao;
import kodlamaio.hrms.entities.concretes.EmailVerification;

@Repository
public class EmailVerificationManager implements EmailVerificationService {

	private EmailVerificationDao emailVerifcationDao;
	@Autowired
	public EmailVerificationManager(EmailVerificationDao emailVerifcationDao) {
		super();
		this.emailVerifcationDao = emailVerifcationDao;
	}

	@Override
	public DataResult<List<EmailVerification>> getAll() {
		return new SuccessDataResult<List<EmailVerification>>
		(this.emailVerifcationDao.findAll(),"Email onaylamaları listelendi.");
	}

	@Override
	public Result add(EmailVerification emailVerification) {
		this.emailVerifcationDao.save(emailVerification);
		return new SuccessResult("Email onaylama eklendi.");
	}

}
