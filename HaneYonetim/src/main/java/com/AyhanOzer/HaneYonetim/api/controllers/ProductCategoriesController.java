package com.AyhanOzer.HaneYonetim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AyhanOzer.HaneYonetim.business.abstracts.ProductCategoryService;
import com.AyhanOzer.HaneYonetim.entities.concretes.ProductCategory;

@RestController
@RequestMapping("/api/productcategories")
public class ProductCategoriesController {
	
	private ProductCategoryService productCategoryService;

	@Autowired
	public ProductCategoriesController(ProductCategoryService productCategoryService) {
		super();
		this.productCategoryService = productCategoryService;
	}
	
	@GetMapping("/getall")
	public List<ProductCategory> getAll(){
		return this.productCategoryService.getAll();
	}

}
