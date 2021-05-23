package bizdenAlTicaret.business.concretes;

import java.util.Scanner;

import bizdenAlTicaret.EmailValidator;
import bizdenAlTicaret.business.abstracts.UserService;
import bizdenAlTicaret.core.EmailService;
import bizdenAlTicaret.dataAccess.abstracts.UserDao;
import bizdenAlTicaret.entities.concretes.GoogleUser;
import bizdenAlTicaret.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private EmailService emailService;

	public UserManager(UserDao userDao,EmailService emailService) {
		
		this.userDao = userDao;
		this.emailService=emailService;
	}

	@Override
	public void register(User user) {

		if(user.getParola().length()>=6 && user.getFirstName().length()>=2 && user.getLastName().length()>=2 && 
				EmailValidator.isEmailValid(user.getEmail())) {
			userDao.register(user);
			this.emailService.verifyEmail("Ho� geldiniz. " + user.getFirstName() + " "+ user.getEmail());
			
		}
		
		else {
			System.out.println("Girdi�iniz bilgiler ge�erli bilgiler de�il yada mailiniz bir mail adresi de�il ");
		}
	}

	@Override
	public void login(User user) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Kullan�c� ad� : ");
		
		String email=scan.nextLine();
		System.out.println(email);
		System.out.print("Parola : ");
		String parola=scan.nextLine();
		System.out.println(parola);
		System.out.println(user.getEmail());
		System.out.println(user.getParola());

		if(user.getEmail().equals(email) && user.getParola().equals(parola)) {
			userDao.login(user);
		}
		else {
			System.out.println("Email adresiniz yada parolan�z hatal�. L�tfen tekrar deneyiniz.");
		}

	}


	

}
