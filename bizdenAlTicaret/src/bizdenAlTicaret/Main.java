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
			
		System.out.println("S�STEME KAYIT TERC�H�");
		System.out.println("--------------------------------------------------------");
		System.out.println("G--GOOGLE HESABIYLA KAYIT YAPINIZ.");
		System.out.println("K--KULLANICI B�LG�LER� G�REREK KAYIT YAPINIZ.");
		System.out.println("--------------------------------------------------------");
		System.out.println("S�STEME G�R�� TERC�H�");
		System.out.println("--------------------------------------------------------");
		System.out.println("A--GOOGLE HESABIYLA G�R�� YAPINIZ.");
		System.out.println("B--KULLANICI B�LG�LER� G�REREK G�R�� YAPINIZ.");
		System.out.println("--------------------------------------------------------");
		System.out.println("SE��M�N�Z (G/K/A/B)");

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
			System.out.println("KULLANICI B�LG�LER�YLE KAYIT");
			System.out.println("----------------------------------------------------");

			Scanner girdi = new Scanner(System.in);

			System.out.print("Id :");
			user.setId(girdi.nextInt());
			System.out.print("Ad�n�z : ");
			user.setFirstName(girdi.next());
			System.out.print("Soyad�n�z : ");
			user.setLastName(girdi.next());
			System.out.print("Email adresi : ");
			user.setEmail(girdi.next());
			System.out.print("Parola : ");
			user.setParola(girdi.next());

			UserService userService = new UserManager(new HibernateUserDao(), new SendEmailManagerAdapter());
			userService.register(user);
		}

		else if (secilen.toUpperCase().equals("A")) {
			System.out.println("GOOGLE HESABIYLA G�R��");
			System.out.println("-----------------------------------------------------");

			GoogleUserService googleUserService = new GoogleUserManager(new HibernateGoogleUserDao(),
					new VerifyGoogleManagerAdapter());

		
			googleUserService.loginWithGoogle(googleUser);

		} 
		else if (secilen.toUpperCase().equals("B")) {
			System.out.println("KULLANICI B�LG�LER�YLE G�R��");
			System.out.println("-----------------------------------------------------");

			UserService UserService = new UserManager(new HibernateUserDao(),null);

		
			UserService.login(user);

		}
		else {
			System.out.println("GE�ERS�Z SE��M YAPTINIZ.");

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
