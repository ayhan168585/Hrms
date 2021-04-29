package bizdenAlTicaret.core;

import bizdenAlTicaret.entities.concretes.GoogleUser;
import bizdenAlTicaret.verifyGoogleAccount.VerifyGoogleManager;

public class VerifyGoogleManagerAdapter implements GoogleService {

	@Override
	public boolean verifyGoogleAccount(GoogleUser googleUser) {
		 
		VerifyGoogleManager googleManager=new VerifyGoogleManager();
		return googleManager.verifyAccount(googleUser);
	}

}
