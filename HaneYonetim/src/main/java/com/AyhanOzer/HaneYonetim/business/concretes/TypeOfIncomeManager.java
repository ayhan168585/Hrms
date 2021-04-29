package com.AyhanOzer.HaneYonetim.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.AyhanOzer.HaneYonetim.business.abstracts.TypeOfIncomeService;
import com.AyhanOzer.HaneYonetim.dataAccess.abstracts.TypeOfIncomeDao;
import com.AyhanOzer.HaneYonetim.entities.concretes.TypeOfIncome;

@Repository
public class TypeOfIncomeManager implements TypeOfIncomeService{

	private TypeOfIncomeDao typeOfIncomeDao;
	@Autowired
	public TypeOfIncomeManager(TypeOfIncomeDao typeOfIncomeDao) {
		super();
		this.typeOfIncomeDao = typeOfIncomeDao;
	}
	@Override
	public List<TypeOfIncome> getAll() {
		// TODO Auto-generated method stub
		return typeOfIncomeDao.findAll();
	}

}
