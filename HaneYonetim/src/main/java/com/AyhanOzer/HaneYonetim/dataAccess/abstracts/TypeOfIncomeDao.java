package com.AyhanOzer.HaneYonetim.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AyhanOzer.HaneYonetim.entities.concretes.TypeOfIncome;

public interface TypeOfIncomeDao extends JpaRepository<TypeOfIncome, Integer>{

}
