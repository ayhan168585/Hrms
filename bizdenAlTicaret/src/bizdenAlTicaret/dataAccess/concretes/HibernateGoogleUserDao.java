package bizdenAlTicaret.dataAccess.concretes;

import bizdenAlTicaret.dataAccess.abstracts.GoogleUserDao;
import bizdenAlTicaret.entities.concretes.GoogleUser;

public class HibernateGoogleUserDao implements GoogleUserDao{

	@Override
	public void registerWithGoogle(GoogleUser googleUser) {

		System.out.println("Kullan�c� google hesab�yla sisteme kay�t oldu." + googleUser.getEmail());
	}

	@Override
	public void loginWithGoogle(GoogleUser googleUser) {
		System.out.println("Google hesab�n�zla sisteme giri� yapt�n�z." + googleUser.getEmail());
		
	}

}
