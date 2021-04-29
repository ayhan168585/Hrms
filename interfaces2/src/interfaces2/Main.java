package interfaces2;

public class Main {

	public static void main(String[] args) {

		//1. Yöntem strateji yöntemi
		
		//2. Yöntem dependency injection yöntemi
		
		CustomerManager customerManager=new CustomerManager(new SqlServerCustomerDal());
		
		customerManager.add();
		
//		customerManager.customerDal=new MySqlCustomerDal();
//		customerManager.add();
		
	}

}
