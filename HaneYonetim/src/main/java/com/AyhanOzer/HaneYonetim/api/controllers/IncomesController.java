package com.AyhanOzer.HaneYonetim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AyhanOzer.HaneYonetim.business.abstracts.IncomeService;
import com.AyhanOzer.HaneYonetim.entities.concretes.Income;

@RestController
@RequestMapping("/api/incomes")
public class IncomesController {
	
	private IncomeService incomeService;

	@Autowired
	public IncomesController(IncomeService incomeService) {
		super();
		this.incomeService = incomeService;
	}
	
	@GetMapping("/getall")
	public List<Income> getAll(){
		return this.incomeService.getAll();
	}

}
