package com.AyhanOzer.HaneYonetim.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.AyhanOzer.HaneYonetim.business.abstracts.HouseholdService;
import com.AyhanOzer.HaneYonetim.dataAccess.abstracts.HouseholdDao;
import com.AyhanOzer.HaneYonetim.entities.concretes.Household;

@Repository
public class HouseholdManager implements HouseholdService {

	private HouseholdDao houseHoldDao;
	@Autowired
	public HouseholdManager(HouseholdDao houseHoldDao) {
		super();
		this.houseHoldDao = houseHoldDao;
	}
	@Override
	public List<Household> getAll() {
		// TODO Auto-generated method stub
		return houseHoldDao.findAll();
	}

}
