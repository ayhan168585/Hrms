package com.AyhanOzer.HaneYonetim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AyhanOzer.HaneYonetim.business.abstracts.SpendingService;
import com.AyhanOzer.HaneYonetim.entities.concretes.Spending;

@RestController
@RequestMapping("/api/spendings")
public class SpendingsController {
	
	private SpendingService spendingService;

	@Autowired
	public SpendingsController(SpendingService spendingService) {
		super();
		this.spendingService = spendingService;
	}
	@GetMapping("/getall")
	public List<Spending> getAll(){
		return this.spendingService.getAll();
	}

}
