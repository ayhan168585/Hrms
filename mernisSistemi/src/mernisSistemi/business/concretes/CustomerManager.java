package mernisSistemi.business.concretes;

import mernisSistemi.core.adapters.MernisServisAdapter;
import mernisSistemi.entities.concretes.Customer;

public class CustomerManager {

	public boolean tcDogrula(Customer customer) {

		MernisServisAdapter adapter = new MernisServisAdapter();
		var result = adapter.checkIfRealPerson(customer);
		if (result) {
			System.out.println("do�rulamadan ge�ti. b�yle bir ki�i mevcut");
			return true;
		} else {
			System.out.println("do�rulamadan ge�emadi. b�yle bir ki�i mevcut de�il");
			return false;
		}
	}
}
