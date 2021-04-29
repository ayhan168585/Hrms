package com.AyhanOzer.HaneYonetim.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.AyhanOzer.HaneYonetim.business.abstracts.ExpenseService;
import com.AyhanOzer.HaneYonetim.dataAccess.abstracts.ExpenseDao;
import com.AyhanOzer.HaneYonetim.entities.concretes.Expense;

@Repository
public class ExpenseManager implements ExpenseService {

	private ExpenseDao expenseDao;
	
	@Autowired
	public ExpenseManager(ExpenseDao expenseDao) {
		super();
		this.expenseDao = expenseDao;
	}
	@Override
	public List<Expense> getAll() {
		// TODO Auto-generated method stub
		return expenseDao.findAll();
	}

}
