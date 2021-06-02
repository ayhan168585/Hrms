package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.WorkingFeature;

public interface WorkingFeatureService {

	DataResult<List<WorkingFeature>> getAll();
	Result add(WorkingFeature workingFeature);
}
