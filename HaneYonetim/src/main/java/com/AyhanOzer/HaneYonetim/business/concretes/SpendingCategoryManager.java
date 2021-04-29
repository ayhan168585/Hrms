package com.AyhanOzer.HaneYonetim.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.AyhanOzer.HaneYonetim.business.abstracts.SpendingCategoryService;
import com.AyhanOzer.HaneYonetim.dataAccess.abstracts.SpendingCategoryDao;
import com.AyhanOzer.HaneYonetim.entities.concretes.SpendingCategory;

@Repository
public class SpendingCategoryManager implements SpendingCategoryService{

	private SpendingCategoryDao spendingCategoryDao;
	@Autowired
	public SpendingCategoryManager(SpendingCategoryDao spendingCategoryDao) {
		super();
		this.spendingCategoryDao = spendingCategoryDao;
	}
	@Override
	public List<SpendingCategory> getAll() {
		// TODO Auto-generated method stub
		return spendingCategoryDao.findAll();
	}

}
