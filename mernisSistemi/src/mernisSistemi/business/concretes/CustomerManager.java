package mernisSistemi.business.concretes;

import mernisSistemi.core.adapters.MernisServisAdapter;
import mernisSistemi.entities.concretes.Customer;

public class CustomerManager {

	public boolean tcDogrula(Customer customer) {

		MernisServisAdapter adapter = new MernisServisAdapter();
		var result = adapter.checkIfRealPerson(customer);
		if (result) {
			System.out.println("doðrulamadan geçti. böyle bir kiþi mevcut");
			return true;
		} else {
			System.out.println("doðrulamadan geçemadi. böyle bir kiþi mevcut deðil");
			return false;
		}
	}
}
