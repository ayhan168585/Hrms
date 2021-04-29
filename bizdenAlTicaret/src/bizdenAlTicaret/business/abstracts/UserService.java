package bizdenAlTicaret.business.abstracts;

import bizdenAlTicaret.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void login(User user);

}
