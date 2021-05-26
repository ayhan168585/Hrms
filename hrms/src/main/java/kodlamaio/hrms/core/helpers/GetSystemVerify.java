package kodlamaio.hrms.core.helpers;

import java.util.Random;

public class GetSystemVerify {

	public static boolean Run() {
		Random rnd=new Random();
		int sayi=rnd.nextInt(3);
		if(sayi==1) {
			return false;
		}
		else {
			return true;
		}
	}
}
