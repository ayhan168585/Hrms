package com.AyhanOzer.HaneYonetim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AyhanOzer.HaneYonetim.business.abstracts.SpendingCategoryService;
import com.AyhanOzer.HaneYonetim.entities.concretes.SpendingCategory;

@RestController
@RequestMapping("/api/spendingcategories")
public class SpendingCategoriesController {
	
	private SpendingCategoryService spendingCategoryService;

	@Autowired
	public SpendingCategoriesController(SpendingCategoryService spendingCategoryService) {
		super();
		this.spendingCategoryService = spendingCategoryService;
	}
	
	@GetMapping("/getall")
	public List<SpendingCategory> getAll(){
		return this.spendingCategoryService.getAll();
	}

}
