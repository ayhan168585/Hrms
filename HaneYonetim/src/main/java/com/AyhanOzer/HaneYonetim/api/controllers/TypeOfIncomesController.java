package com.AyhanOzer.HaneYonetim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AyhanOzer.HaneYonetim.business.abstracts.TypeOfIncomeService;
import com.AyhanOzer.HaneYonetim.entities.concretes.TypeOfIncome;

@RestController
@RequestMapping("/api/typeofincomes")
public class TypeOfIncomesController {
	
	private TypeOfIncomeService typeOfIncomes;

	@Autowired
	public TypeOfIncomesController(TypeOfIncomeService typeOfIncomes) {
		super();
		this.typeOfIncomes = typeOfIncomes;
	}
	@GetMapping("/getall")
	public List<TypeOfIncome> getAll(){
		return this.typeOfIncomes.getAll();
	}

}
