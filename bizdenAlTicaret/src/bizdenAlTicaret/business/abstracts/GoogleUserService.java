package bizdenAlTicaret.business.abstracts;

import bizdenAlTicaret.entities.concretes.GoogleUser;

public interface GoogleUserService {
	
	void registerWithGoogle(GoogleUser googleUser);
	void loginWithGoogle(GoogleUser googleUser);

}
