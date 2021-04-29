package interfaces2;


public class CustomerManager {

	//1. Yöntem strateji yöntemi
	//2. yöntem dependency injection
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		
		this.customerDal = customerDal;
	}
	public void add() {
		customerDal.add();
	}
}
