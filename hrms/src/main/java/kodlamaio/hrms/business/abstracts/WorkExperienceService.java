package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.School;
import kodlamaio.hrms.entities.concretes.WorkExperience;

public interface WorkExperienceService {

	DataResult<List<WorkExperience>> getAll();
	DataResult<List<WorkExperience>> getAllSorted();
	DataResult<List<WorkExperience>> getAllSortedByAsc();
	Result add(WorkExperience workExperience);
}
