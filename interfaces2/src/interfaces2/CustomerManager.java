package interfaces2;


public class CustomerManager {

	//1. Y�ntem strateji y�ntemi
	//2. y�ntem dependency injection
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		
		this.customerDal = customerDal;
	}
	public void add() {
		customerDal.add();
	}
}
