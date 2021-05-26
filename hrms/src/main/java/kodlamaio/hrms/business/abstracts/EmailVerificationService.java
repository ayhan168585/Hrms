package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmailVerification;

public interface EmailVerificationService {

	DataResult<List<EmailVerification>> getAll();
	Result add(EmailVerification emailVerification);
}
