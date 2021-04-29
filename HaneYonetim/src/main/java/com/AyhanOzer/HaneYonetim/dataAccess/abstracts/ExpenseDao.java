package com.AyhanOzer.HaneYonetim.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AyhanOzer.HaneYonetim.entities.concretes.Expense;

public interface ExpenseDao extends JpaRepository<Expense,Integer> {

}
