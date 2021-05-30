package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.northwind.entities.concretes.Product;

public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>> getAll();
	 DataResult<List<JobAdvertisement>> getAll(int pageNo,int pageSize);
	 DataResult<List<JobAdvertisement>> getByCompanyName(int userId);
	 DataResult<List<JobAdvertisement>> getAllByIsActive(boolean isActive);
	 DataResult<List<JobAdvertisement>> getAllSorted();

	Result add(JobAdvertisement jobAdvertisement);
}
