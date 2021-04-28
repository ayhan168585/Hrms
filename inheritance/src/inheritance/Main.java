package inheritance;

public class Main {

	public static void main(String[] args) {
		
	IndividualCustomer engin=new IndividualCustomer();
	
	engin.id=1;
	engin.customerNumber="1234";
	engin.firstName="Engin";
	engin.lastName="Demiroð";
	engin.nationalIdentity="12345678910";
	
	System.out.println(engin.id);
	System.out.println(engin.customerNumber);
	System.out.println(engin.firstName);
	System.out.println(engin.lastName);
	System.out.println(engin.nationalIdentity);
	
	CorporateCustomer hepsiBurada=new CorporateCustomer();

	hepsiBurada.id=2;
	hepsiBurada.customerNumber="12345";
	hepsiBurada.companyName="Hepsi Burada";
	hepsiBurada.taxNumber="1234567890";
	
	System.out.println("------------------------------------------------");
	System.out.println(hepsiBurada.id);
	System.out.println(hepsiBurada.customerNumber);
	System.out.println(hepsiBurada.companyName);
	System.out.println(hepsiBurada.taxNumber);
	System.out.println("--------------------------------------------------");
	
	CustomerManager customerManager=new CustomerManager();
	
	customerManager.add(engin);
	customerManager.add(hepsiBurada);
	
	Customer[] customers= {engin,hepsiBurada};
	
	customerManager.addMultiple(customers);
	}
	
	

}
