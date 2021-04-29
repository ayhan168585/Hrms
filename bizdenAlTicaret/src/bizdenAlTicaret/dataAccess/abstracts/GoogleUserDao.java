package bizdenAlTicaret.dataAccess.abstracts;

import bizdenAlTicaret.entities.concretes.GoogleUser;

public interface GoogleUserDao {
	
	void registerWithGoogle(GoogleUser googleUser);
	void loginWithGoogle(GoogleUser googleUser);

}
