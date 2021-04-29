package bizdenAlTicaret.dataAccess.concretes;

import bizdenAlTicaret.dataAccess.abstracts.GoogleUserDao;
import bizdenAlTicaret.entities.concretes.GoogleUser;

public class HibernateGoogleUserDao implements GoogleUserDao{

	@Override
	public void registerWithGoogle(GoogleUser googleUser) {

		System.out.println("Kullanýcý google hesabýyla sisteme kayýt oldu." + googleUser.getEmail());
	}

	@Override
	public void loginWithGoogle(GoogleUser googleUser) {
		System.out.println("Google hesabýnýzla sisteme giriþ yaptýnýz." + googleUser.getEmail());
		
	}

}
