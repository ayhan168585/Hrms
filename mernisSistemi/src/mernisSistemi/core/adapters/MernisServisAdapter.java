package mernisSistemi.core.adapters;

import mernisSistemi.entities.concretes.Customer;

import java.rmi.RemoteException;
import java.util.Locale;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServisAdapter implements CustomCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		var result=true;
		try {
			
			result=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityNumber()) , 
					customer.getFirstName().toUpperCase(new Locale("tr")), 
					customer.getLastName().toUpperCase(new Locale("tr")), customer.getBirthYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
