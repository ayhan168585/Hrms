package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.business.abstracts.MernisVerificationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.MernisVerificationDao;
import kodlamaio.hrms.entities.concretes.MernisVerification;

@Repository
public class MernisVerificationManager implements MernisVerificationService{

	private MernisVerificationDao mernisVerificationDao;
	@Autowired
	public MernisVerificationManager(MernisVerificationDao mernisVerificationDao) {
		super();
		this.mernisVerificationDao = mernisVerificationDao;
	}

	@Override
	public DataResult<List<MernisVerification>> getAll() {
		return new SuccessDataResult<List<MernisVerification>>
		(this.mernisVerificationDao.findAll(),"Mernis onaylamaları listelendi.");
	}

	@Override
	public Result add(MernisVerification mernisVerification) {
		this.mernisVerificationDao.save(mernisVerification);
		return new SuccessResult("Mernis onaylaması eklendi.");
	}

}
