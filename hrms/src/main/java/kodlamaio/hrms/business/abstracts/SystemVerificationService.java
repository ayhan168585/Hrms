package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemVerification;

public interface SystemVerificationService {
	
	DataResult<List<SystemVerification>> getAll();
	Result add(SystemVerification systemVerification);

}
