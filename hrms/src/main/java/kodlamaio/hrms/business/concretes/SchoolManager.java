package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SchoolDao;
import kodlamaio.hrms.entities.concretes.School;

@Repository
public class SchoolManager implements SchoolService{

	private SchoolDao schoolDao;
	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public DataResult<List<School>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<School>>
		(this.schoolDao.findAll(),"Okullar listelendi.");
	}

	@Override
	public Result add(School school) {
		// TODO Auto-generated method stub
		this.schoolDao.save(school);
		return new SuccessResult("Yeni bir okul eklendi.");
	}

	@Override
	public DataResult<List<School>> getAllSorted() {
		// TODO Auto-generated method stub
		Sort sort=Sort.by(Sort.Direction.DESC, "graduationYear");
		return new SuccessDataResult<List<School>>
		(this.schoolDao.findAll(sort),"Son mezuniyet tarihine göre okullar listelendi.");
	}

	@Override
	public DataResult<List<School>> getAllSortedByAsc() {
		Sort sort=Sort.by(Sort.Direction.ASC, "graduationYear");
		return new SuccessDataResult<List<School>>
		(this.schoolDao.findAll(sort),"İlk mezuniyet tarihine göre okullar listelendi.");
	}

}
