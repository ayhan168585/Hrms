package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.id=1;
		product.name="Laptop";
		product.description="16 GB Ram";
		product.price=15000;
		product.stockAmount=10;
		
		System.out.println("Ürün Adý :"+product.name);
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);

	}

}
