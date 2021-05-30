package mernisSistemi.core.adapters;

import mernisSistemi.entities.concretes.Customer;

public interface CustomCheckService {

	boolean checkIfRealPerson(Customer customer);
}
