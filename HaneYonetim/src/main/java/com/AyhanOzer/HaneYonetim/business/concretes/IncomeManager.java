package com.AyhanOzer.HaneYonetim.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.AyhanOzer.HaneYonetim.business.abstracts.IncomeService;
import com.AyhanOzer.HaneYonetim.dataAccess.abstracts.IncomeDao;
import com.AyhanOzer.HaneYonetim.entities.concretes.Income;

@Repository
public class IncomeManager implements IncomeService {

	private IncomeDao incomeDao;
	@Autowired
	public IncomeManager(IncomeDao incomeDao) {
		super();
		this.incomeDao = incomeDao;
	}
	@Override
	public List<Income> getAll() {
		// TODO Auto-generated method stub
		return this.incomeDao.findAll();
	}

}
