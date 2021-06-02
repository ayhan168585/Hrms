package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.business.abstracts.ForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ForeignLanguageDao;
import kodlamaio.hrms.entities.concretes.ForeignLanguage;

@Repository
public class ForeignLanguageManager implements ForeignLanguageService {

	private ForeignLanguageDao foreignLanguageDao;
	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao) {
		super();
		this.foreignLanguageDao = foreignLanguageDao;
	}

	@Override
	public DataResult<List<ForeignLanguage>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<ForeignLanguage>>
		(this.foreignLanguageDao.findAll(),"Yabancı diller listelendi.");
	}

	@Override
	public Result add(ForeignLanguage foreignLanguage) {
		// TODO Auto-generated method stub
		this.foreignLanguageDao.save(foreignLanguage);
		return new SuccessResult("Yeni bir yabancı dil eklendi.");
	}

}
