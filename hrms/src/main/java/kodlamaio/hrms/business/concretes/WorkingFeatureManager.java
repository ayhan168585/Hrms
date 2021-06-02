package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.business.abstracts.WorkingFeatureService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.WorkingFeatureDao;
import kodlamaio.hrms.entities.concretes.WorkingFeature;

@Repository
public class WorkingFeatureManager implements WorkingFeatureService {

	private WorkingFeatureDao workingFeatureDao;
	@Autowired
	public WorkingFeatureManager(WorkingFeatureDao workingFeatureDao) {
		super();
		this.workingFeatureDao = workingFeatureDao;
	}

	@Override
	public DataResult<List<WorkingFeature>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<WorkingFeature>>
		(this.workingFeatureDao.findAll(),"Çalışma özellikleri listelendi.");
	}

	@Override
	public Result add(WorkingFeature workingFeature) {
		// TODO Auto-generated method stub
		this.workingFeatureDao.save(workingFeature);
		return new SuccessResult("Yeni bir çalışma özelliği eklendi.");
	}

}
