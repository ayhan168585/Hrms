package com.AyhanOzer.HaneYonetim.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.AyhanOzer.HaneYonetim.business.abstracts.BirimService;
import com.AyhanOzer.HaneYonetim.business.abstracts.UnitService;
import com.AyhanOzer.HaneYonetim.dataAccess.abstracts.UnitDao;
import com.AyhanOzer.HaneYonetim.entities.concretes.Unit;

@Repository
public class UnitManager implements UnitService {

	private UnitDao unitDao;

	@Autowired
	public UnitManager(UnitDao unitDao) {
		super();
		this.unitDao = unitDao;
	}

	@Override
	public List<Unit> getAll() {
		// TODO Auto-generated method stub
		return this.unitDao.findAll();
	}

}
