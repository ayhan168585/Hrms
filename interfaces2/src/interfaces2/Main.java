package interfaces2;

public class Main {

	public static void main(String[] args) {

		//1. Y�ntem strateji y�ntemi
		
		//2. Y�ntem dependency injection y�ntemi
		
		CustomerManager customerManager=new CustomerManager(new SqlServerCustomerDal());
		
		customerManager.add();
		
//		customerManager.customerDal=new MySqlCustomerDal();
//		customerManager.add();
		
	}

}
