package com.AyhanOzer.HaneYonetim.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.AyhanOzer.HaneYonetim.business.abstracts.ProductCategoryService;
import com.AyhanOzer.HaneYonetim.dataAccess.abstracts.ProductCategoryDao;
import com.AyhanOzer.HaneYonetim.entities.concretes.ProductCategory;

@Repository
public class ProductCategoryManager implements ProductCategoryService{

	private ProductCategoryDao productCategoryDao;
	
	@Autowired
	public ProductCategoryManager(ProductCategoryDao productCategoryDao) {
		super();
		this.productCategoryDao = productCategoryDao;
	}
	@Override
	public List<ProductCategory> getAll() {
		// TODO Auto-generated method stub
		return productCategoryDao.findAll();
	}

}
