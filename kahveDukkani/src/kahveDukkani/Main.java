package kahveDukkani;

import java.sql.Date;
import java.util.Random;

import kahveDukkani.Abstract.BaseCustomerManager;
import kahveDukkani.Abstract.CustomerCheckService;
import kahveDukkani.Concrete.NeroCustomerManager;
import kahveDukkani.Concrete.StarbucksCustomerManager;
import kahveDukkani.Entities.Customer;

public class Main {

	public static void main(String[] args) {

	BaseCustomerManager customerManager=new StarbucksCustomerManager(new CustomerCheckService() {
		
		@Override
		public boolean CheckIfRealPerson(Customer customer) {
			// TODO Auto-generated method stub
			Random r=new Random();
			int sayi=r.nextInt(3);
			if(sayi==1) {
				return false;
			}
			else {
				return true;
			}
		}
	});
	
	
	Customer customer1=new Customer();
	Customer customer2=new Customer();

	
	customer1.setId(1);
	customer1.setFirstName("Ayhan");
	customer1.setLastName("Özer");
	customer1.setDateOfBirth(new Date(1969,8,24));
	customer1.setNationalityId("12345678910");
	
	customer2.setId(2);
	customer2.setFirstName("Harun");
	customer2.setLastName("Özer");
	customer2.setDateOfBirth(new Date(1969,8,24));
	customer2.setNationalityId("12345678911");
	
	BaseCustomerManager customerManager2=new NeroCustomerManager();
	
	customerManager2.add(customer2);
	
	customerManager.add(customer1);
	}
	
	
	

	

	
	
		
	
	

}
