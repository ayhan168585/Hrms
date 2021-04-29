package bizdenAlTicaret.dataAccess.concretes;

import bizdenAlTicaret.dataAccess.abstracts.UserDao;
import bizdenAlTicaret.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void register(User user) {

		System.out.println("Kullanýcýnýn sisteme kayýtýnýn onaylanmasý için mail gönderildi." + user.getFirstName() + " "+ user.getLastName());
	}

	@Override
	public void login(User user) {
		
		System.out.println("Sisteme giriþ yaptýnýz." + user.getEmail());

				
	}

}
