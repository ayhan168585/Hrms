package interfaces2;

public class SqlServerCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("M��teri eklendi: SqlServer");		
	}

}
