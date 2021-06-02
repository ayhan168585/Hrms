package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CirculumVitae;

public interface CirculumVitaeService {

	DataResult<List<CirculumVitae>> getAll();
	Result add(CirculumVitae circulumVitae);
	DataResult<CirculumVitae> getByUserId(int userId);

}
