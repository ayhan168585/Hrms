package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import kodlamaio.hrms.business.abstracts.CirculumVitaeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CirculumVitaeDao;
import kodlamaio.hrms.entities.concretes.CirculumVitae;

@Repository
public class CirculumVitaeManager implements CirculumVitaeService{

	private CirculumVitaeDao circulumVitaeDao;
	@Autowired
	public CirculumVitaeManager(CirculumVitaeDao circulumVitaeDao) {
		super();
		this.circulumVitaeDao = circulumVitaeDao;
	}

	@Override
	public DataResult<List<CirculumVitae>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<CirculumVitae>>
		(this.circulumVitaeDao.findAll(),"Özgeçmişler listelendi.");
	}

	@Override
	public Result add(CirculumVitae circulumVitae) {
		// TODO Auto-generated method stub
		this.circulumVitaeDao.save(circulumVitae);
		return new SuccessResult("Yeni bir özgeçmiş eklendi.");
	}

	@Override
	public DataResult<CirculumVitae> getByUserId(int userId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<CirculumVitae>
		(this.circulumVitaeDao.getByUserId(userId),"Seçtiğiniz kullanıcıya ait özgeçmiş listelendi.");
	}

}
