package bizdenAlTicaret.core;

import bizdenAlTicaret.sendEmail.SendEmailManager;

public class SendEmailManagerAdapter implements EmailService{

	@Override
	public void verifyEmail(String message) {
		SendEmailManager sendEmail=new SendEmailManager();
		
		sendEmail.enterSystem(message);
	}

}
