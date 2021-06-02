package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.business.abstracts.RoleService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.RoleDao;
import kodlamaio.hrms.entities.concretes.Role;

@Repository
public class RoleManager implements RoleService {

	private RoleDao roleDao;
	@Autowired
	public RoleManager(RoleDao roleDao) {
		super();
		this.roleDao = roleDao;
	}

	@Override
	public DataResult<List<Role>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Role>>
		(this.roleDao.findAll(),"Kullanıcı rolleri listelendi");
	}

	@Override
	public Result add(Role role) {
		// TODO Auto-generated method stub
		this.roleDao.save(role);
		return new SuccessResult("Yeni bir rol eklendi");
	}

}
