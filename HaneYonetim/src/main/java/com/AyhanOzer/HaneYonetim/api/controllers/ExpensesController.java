package com.AyhanOzer.HaneYonetim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AyhanOzer.HaneYonetim.business.abstracts.ExpenseService;
import com.AyhanOzer.HaneYonetim.entities.concretes.Expense;

@RestController
@RequestMapping("/api/expenses")
public class ExpensesController {
	
	private ExpenseService expenseService;
@Autowired
	public ExpensesController(ExpenseService expenseService) {
		super();
		this.expenseService = expenseService;
	}
@GetMapping("/getall")

public List<Expense> getAll(){
	return this.expenseService.getAll();
}

}
