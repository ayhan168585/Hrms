package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.business.abstracts.ProgrammingLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ProgrammingLanguageDao;
import kodlamaio.hrms.entities.concretes.ProgrammingLanguage;

@Repository
public class ProgramLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageDao programLanguageDao;
	@Autowired
	public ProgramLanguageManager(ProgrammingLanguageDao programLanguageDao) {
		super();
		this.programLanguageDao = programLanguageDao;
	}

	@Override
	public DataResult<List<ProgrammingLanguage>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<ProgrammingLanguage>>
		(this.programLanguageDao.findAll(),"Programlama dilleri listelendi.");
	}

	@Override
	public Result add(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		this.programLanguageDao.save(programmingLanguage);
		return new SuccessResult("Yeni bir programlama dili eklendi.");
	}

}
