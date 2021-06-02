package com.AyhanOzer.HaneYonetim.business.abstracts;

import java.util.List;

import com.AyhanOzer.HaneYonetim.core.utilities.results.DataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.Result;
import com.AyhanOzer.HaneYonetim.entities.concretes.Expense;
import com.AyhanOzer.HaneYonetim.entities.dtos.ExpensesWithSpendingDto;

public interface ExpenseService {

	Result add(Expense expense);
	
	DataResult<List<Expense>> getAll();
	
	DataResult<List<ExpensesWithSpendingDto>> getExpenseWithSpendingDetails();
}
