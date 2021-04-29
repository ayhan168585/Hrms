package com.AyhanOzer.HaneYonetim.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.AyhanOzer.HaneYonetim.business.abstracts.SpendingService;
import com.AyhanOzer.HaneYonetim.dataAccess.abstracts.SpendingDao;
import com.AyhanOzer.HaneYonetim.entities.concretes.Spending;

@Repository
public class SpendingManager  implements SpendingService{

	private SpendingDao spendingDao;
	@Autowired
	public SpendingManager(SpendingDao spendingDao) {
		super();
		this.spendingDao = spendingDao;
	}
	@Override
	public List<Spending> getAll() {
		// TODO Auto-generated method stub
		return this.spendingDao.findAll();
	}

}
