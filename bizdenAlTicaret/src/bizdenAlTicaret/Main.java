package bizdenAlTicaret;

import java.util.List;
import java.util.Scanner;

import com.sun.source.tree.DoWhileLoopTree;

import bizdenAlTicaret.business.abstracts.GoogleUserService;
import bizdenAlTicaret.business.abstracts.UserService;
import bizdenAlTicaret.business.concretes.GoogleUserManager;
import bizdenAlTicaret.business.concretes.UserManager;
import bizdenAlTicaret.core.SendEmailManagerAdapter;
import bizdenAlTicaret.core.VerifyGoogleManagerAdapter;
import bizdenAlTicaret.dataAccess.abstracts.GoogleUserDao;
import bizdenAlTicaret.dataAccess.concretes.HibernateGoogleUserDao;
import bizdenAlTicaret.dataAccess.concretes.HibernateUserDao;
import bizdenAlTicaret.entities.concretes.GoogleUser;
import bizdenAlTicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		Scanner whileSecim=new Scanner(System.in);
		String whileSecilen="";
		
		User user=new User();
		GoogleUser googleUser=new GoogleUser();
		
		
		do {
			
		System.out.println("SÝSTEME KAYIT TERCÝHÝ");
		System.out.println("--------------------------------------------------------");
		System.out.println("G--GOOGLE HESABIYLA KAYIT YAPINIZ.");
		System.out.println("K--KULLANICI BÝLGÝLERÝ GÝREREK KAYIT YAPINIZ.");
		System.out.println("--------------------------------------------------------");
		System.out.println("SÝSTEME GÝRÝÞ TERCÝHÝ");
		System.out.println("--------------------------------------------------------");
		System.out.println("A--GOOGLE HESABIYLA GÝRÝÞ YAPINIZ.");
		System.out.println("B--KULLANICI BÝLGÝLERÝ GÝREREK GÝRÝÞ YAPINIZ.");
		System.out.println("--------------------------------------------------------");
		System.out.println("SEÇÝMÝNÝZ (G/K/A/B)");

		Scanner secim = new Scanner(System.in);

		String secilen = secim.nextLine();
		System.out.println(secilen.toUpperCase());
		;
		if (secilen.toUpperCase().equals("G")) {
			System.out.println("GOOGLE HESABIYLA KAYIT");
			System.out.println("----------------------------------------------------");
			Scanner googleGirdi = new Scanner(System.in);

			System.out.print("Email adresi : ");
			googleUser.setEmail(googleGirdi.next());
			System.out.print("Parola : ");
			googleUser.setParola(googleGirdi.next());

			GoogleUserService googleUserService = new GoogleUserManager(new HibernateGoogleUserDao(),
					new VerifyGoogleManagerAdapter());
			googleUserService.registerWithGoogle(googleUser);

		} else if (secilen.toUpperCase().equals("K")) {
			System.out.println("KULLANICI BÝLGÝLERÝYLE KAYIT");
			System.out.println("----------------------------------------------------");

			Scanner girdi = new Scanner(System.in);

			System.out.print("Id :");
			user.setId(girdi.nextInt());
			System.out.print("Adýnýz : ");
			user.setFirstName(girdi.next());
			System.out.print("Soyadýnýz : ");
			user.setLastName(girdi.next());
			System.out.print("Email adresi : ");
			user.setEmail(girdi.next());
			System.out.print("Parola : ");
			user.setParola(girdi.next());

			UserService userService = new UserManager(new HibernateUserDao(), new SendEmailManagerAdapter());
			userService.register(user);
		}

		else if (secilen.toUpperCase().equals("A")) {
			System.out.println("GOOGLE HESABIYLA GÝRÝÞ");
			System.out.println("-----------------------------------------------------");

			GoogleUserService googleUserService = new GoogleUserManager(new HibernateGoogleUserDao(),
					new VerifyGoogleManagerAdapter());

		
			googleUserService.loginWithGoogle(googleUser);

		} 
		else if (secilen.toUpperCase().equals("B")) {
			System.out.println("KULLANICI BÝLGÝLERÝYLE GÝRÝÞ");
			System.out.println("-----------------------------------------------------");

			UserService UserService = new UserManager(new HibernateUserDao(),null);

		
			UserService.login(user);

		}
		else {
			System.out.println("GEÇERSÝZ SEÇÝM YAPTINIZ.");

			System.out.println("----------------------------------------------------");

		}

	System.out.println("Devam edecekmisiniz E/H");
	
	//System.out.println(user.getEmail());
	//System.out.println(googleUser.getEmail());
	whileSecilen=whileSecim.nextLine();
		
	} while(whileSecilen.toUpperCase().equals("E"));
	
System.out.println("uygulama bitti.");

}
}
