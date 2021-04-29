package kahveDukkani.Concrete;

import java.util.Random;

import kahveDukkani.Abstract.BaseCustomerManager;
import kahveDukkani.Abstract.CustomerCheckService;
import kahveDukkani.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService{
	
	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void add(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			
			System.out.println("Müþteri veritabanýna kaydedildi " + customer.getFirstName());
		}
		else {
			System.out.println("Müþteri doðrulamadan geçemediði için veritabanýna kaydedilemedi.");
		}
		
	

	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		Random r=new Random();
		int sayi=r.nextInt(3);
		if(sayi==1) {
			return false;
		}
		else {
			return true;
		}
	}

	

	

	

}
