package com.AyhanOzer.HaneYonetim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AyhanOzer.HaneYonetim.business.abstracts.ExpenseService;
import com.AyhanOzer.HaneYonetim.core.utilities.results.DataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.Result;
import com.AyhanOzer.HaneYonetim.entities.concretes.Expense;
import com.AyhanOzer.HaneYonetim.entities.dtos.ExpensesWithSpendingDto;

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

public DataResult<List<Expense>> getAll(){
	return this.expenseService.getAll();
}

@GetMapping("/getexpensewithspendingdetails")
public DataResult<List<ExpensesWithSpendingDto>> getExpenseWithSpendingDetails(){
	return this.expenseService.getExpenseWithSpendingDetails();
}

@PostMapping("/add")
public Result add(@RequestBody Expense expense) {
	
	return this.expenseService.add(expense);
}

}
