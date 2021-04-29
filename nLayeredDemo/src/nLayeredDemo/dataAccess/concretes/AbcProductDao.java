package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.entities.concretes.Product;

public class AbcProductDao implements ProductService {

	@Override
	public void add(Product product) {
		System.out.println("ABC ile eklendi " + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
