package com.AyhanOzer.HaneYonetim.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.AyhanOzer.HaneYonetim.business.abstracts.ExpenseService;
import com.AyhanOzer.HaneYonetim.core.utilities.results.DataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.Result;
import com.AyhanOzer.HaneYonetim.core.utilities.results.SuccessDataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.SuccessResult;
import com.AyhanOzer.HaneYonetim.dataAccess.abstracts.ExpenseDao;
import com.AyhanOzer.HaneYonetim.entities.concretes.Expense;
import com.AyhanOzer.HaneYonetim.entities.dtos.ExpensesWithSpendingDto;

@Repository
public class ExpenseManager implements ExpenseService {

	private ExpenseDao expenseDao;
	
	@Autowired
	public ExpenseManager(ExpenseDao expenseDao) {
		super();
		this.expenseDao = expenseDao;
	}

	@Override
	public DataResult<List<Expense>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Expense>>
		(this.expenseDao.findAll(),"Giderler listelendi.");
	}

	@Override
	public DataResult<List<ExpensesWithSpendingDto>> getExpenseWithSpendingDetails() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<ExpensesWithSpendingDto>>
		(this.expenseDao.getExpenseWithSpendingDetails(),"Gider ayrıntıları listelendi.");
	}

	@Override
	public Result add(Expense expense) {
		// TODO Auto-generated method stub
		this.expenseDao.save(expense);
		return new SuccessResult("Yeni gider eklendi.");
	}
	

}
