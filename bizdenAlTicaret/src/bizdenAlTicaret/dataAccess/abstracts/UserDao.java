package bizdenAlTicaret.dataAccess.abstracts;

import bizdenAlTicaret.entities.concretes.User;

public interface UserDao {
	
	void register(User user);
	void login(User user);
	

}
