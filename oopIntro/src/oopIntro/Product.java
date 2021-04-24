package oopIntro;

public class Product {

	public Product() {
		System.out.println("Ben calistim");
	}
	public Product(int id,int categoryId,String name,double unitPrice,String detail) {
		this();
		this.id=id;
		this.categoryId=categoryId;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	int id;
	int categoryId;
	String name;
	double unitPrice;
	String detail;

}
