package kodlamaio.hrms.business.concretes;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.business.abstracts.WorkExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.WorkExperienceDao;
import kodlamaio.hrms.entities.concretes.School;
import kodlamaio.hrms.entities.concretes.WorkExperience;

@Repository
public class WorkExperienceManager implements WorkExperienceService {

	private WorkExperienceDao workExperienceDao;
	@Autowired
	public WorkExperienceManager(WorkExperienceDao workExperienceDao) {
		super();
		this.workExperienceDao = workExperienceDao;
	}

	@Override
	public DataResult<List<WorkExperience>> getAll() {
		// TODO Auto-generated method stub
		
		return new SuccessDataResult<List<WorkExperience>>
		(this.workExperienceDao.findAll(),"İş tecrübeleri listelendi.");
	}

	@Override
	public Result add(WorkExperience workExperience) {
		// TODO Auto-generated method stub
		this.workExperienceDao.save(workExperience);
		return null;
	}

	@Override
	public DataResult<List<WorkExperience>> getAllSorted() {
		Sort sort=Sort.by(Sort.Direction.DESC, "exitYearFromWork");
		return new SuccessDataResult<List<WorkExperience>>
		(this.workExperienceDao.findAll(sort),"Son işten çıkış tarihine göre iş tecrübeleri listelendi.");
	}

	@Override
	public DataResult<List<WorkExperience>> getAllSortedByAsc() {
		
		Sort sort=Sort.by(Sort.Direction.ASC, "exitYearFromWork");
		return new SuccessDataResult<List<WorkExperience>>
		(this.workExperienceDao.findAll(sort),"İlk işten çıkış tarihine göre iş tecrübeleri listelendi.");
	}

}
