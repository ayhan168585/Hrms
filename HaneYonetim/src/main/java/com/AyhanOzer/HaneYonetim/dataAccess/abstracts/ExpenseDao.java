package com.AyhanOzer.HaneYonetim.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.AyhanOzer.HaneYonetim.entities.concretes.Expense;
import com.AyhanOzer.HaneYonetim.entities.dtos.ExpensesWithSpendingDto;

public interface ExpenseDao extends JpaRepository<Expense,Integer> {

	@Query("Select new com.AyhanOzer.HaneYonetim.entities.dtos.ExpensesWithSpendingDto(s.id,s.spendingName,s.dateOfProcess,s.totalPrice,e.expenseName)"
			+ "From Expense e inner Join e.spendings s")
	List<ExpensesWithSpendingDto> getExpenseWithSpendingDetails();
}
