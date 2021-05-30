import mernisSistemi.business.concretes.CustomerManager;
import mernisSistemi.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer1=new Customer();
		customer1.setId(1);
		customer1.setFirstName("Ayhan");
		customer1.setLastName("Özer");
		customer1.setNationalityNumber("11999591936");
		customer1.setBirthYear(1969);
		
		CustomerManager manager=new CustomerManager();
		manager.tcDogrula(customer1);

	}

}
