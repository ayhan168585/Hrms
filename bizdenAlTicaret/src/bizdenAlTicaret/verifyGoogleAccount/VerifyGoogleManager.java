package bizdenAlTicaret.verifyGoogleAccount;

import java.util.Random;

import bizdenAlTicaret.entities.concretes.GoogleUser;

public class VerifyGoogleManager {
	
	public boolean verifyAccount(GoogleUser googleUser) {
		Random r=new Random();
		int sayi=r.nextInt(3);
		if(sayi!=1) {
			System.out.println("Google hesabınız doğrulandı." + googleUser.getEmail());
			return true;
		}
		else{
			System.out.println("Goggle hesabınız doğrulanamadı");
			return false;
		}
	}

}
