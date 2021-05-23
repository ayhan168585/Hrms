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
			
			System.out.println("M��teri veritaban�na kaydedildi " + customer.getFirstName());
		}
		else {
			System.out.println("M��teri do�rulamadan ge�emedi�i i�in veritaban�na kaydedilemedi.");
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
