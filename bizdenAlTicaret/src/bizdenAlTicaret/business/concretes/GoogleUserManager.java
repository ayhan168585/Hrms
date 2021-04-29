package bizdenAlTicaret.business.concretes;

import java.util.Scanner;

import bizdenAlTicaret.EmailValidator;
import bizdenAlTicaret.business.abstracts.GoogleUserService;
import bizdenAlTicaret.core.GoogleService;
import bizdenAlTicaret.dataAccess.abstracts.GoogleUserDao;
import bizdenAlTicaret.entities.concretes.GoogleUser;

public class GoogleUserManager implements GoogleUserService {
	
	private GoogleUserDao googleUserDao;
	private GoogleService googleService;

	public GoogleUserManager(GoogleUserDao googleUserDao,GoogleService googleService) {
		
		this.googleUserDao = googleUserDao;
		this.googleService = googleService;
	}

	@Override
	public void registerWithGoogle(GoogleUser googleUser) {
		
		if(googleUser.getParola().length()>=6 && EmailValidator.isEmailValid(googleUser.getEmail())) {
			googleUserDao.registerWithGoogle(googleUser);
			this.googleService.verifyGoogleAccount(googleUser);

			
		}
		
		else {
			System.out.println("Girdiðiniz bilgiler geçerli bilgiler deðil yada mailiniz bir mail adresi deðil ");
		}

		
	}

	@Override
	public void loginWithGoogle(GoogleUser googleUser) {
		Scanner giris=new Scanner(System.in);
		System.out.println("Google hesabý email adresi :");
		String googleEmail=giris.next();
		System.out.println("Parola");
		String googleParola=giris.next();
		System.out.println(googleUser.getEmail());
		System.out.println(googleUser.getParola());

		if(googleUser.getEmail().equals(googleEmail) && googleUser.getParola().equals(googleParola)) {
			googleUserDao.loginWithGoogle(googleUser);
		}
		else {
			System.out.println("Email adresiniz yada parolanýz hatalý. Lütfen tekrar deneyiniz.");
		}
		
		
	}

}
