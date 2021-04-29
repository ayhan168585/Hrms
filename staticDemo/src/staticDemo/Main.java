package staticDemo;

public class Main {

	public static void main(String[] args) {

		ProductManager productManager=new ProductManager();
		Product product1=new Product();
		product1.id=1;
		product1.name="Laptop";
		product1.price=4500;
		productManager.add(product1);
		
		DatabaseHelper.Crud.delete();
	}

}
