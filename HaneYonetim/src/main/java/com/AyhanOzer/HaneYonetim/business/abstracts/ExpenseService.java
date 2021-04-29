package com.AyhanOzer.HaneYonetim.business.abstracts;

import java.util.List;

import com.AyhanOzer.HaneYonetim.entities.concretes.Expense;

public interface ExpenseService {

	List<Expense> getAll();
}
