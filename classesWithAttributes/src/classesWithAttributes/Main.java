package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("16 GB Ram");
		product.setPrice(15000);
		product.setStockAmount(10);
		product.setRenk("Siyah");
		
		System.out.println("Ürün Adý :"+product.name);
		System.out.println("Ürün kodu :"+product.getKod());
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);

	}

}
