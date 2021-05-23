package bizdenAlTicaret.dataAccess.concretes;

import bizdenAlTicaret.dataAccess.abstracts.UserDao;
import bizdenAlTicaret.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void register(User user) {

		System.out.println("Kullan�c�n�n sisteme kay�t�n�n onaylanmas� i�in mail g�nderildi." + user.getFirstName() + " "+ user.getLastName());
	}

	@Override
	public void login(User user) {
		
		System.out.println("Sisteme giri� yapt�n�z." + user.getEmail());

				
	}

}
