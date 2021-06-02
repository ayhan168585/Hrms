package com.AyhanOzer.HaneYonetim.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.AyhanOzer.HaneYonetim.business.abstracts.HouseService;
import com.AyhanOzer.HaneYonetim.core.utilities.results.DataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.Result;
import com.AyhanOzer.HaneYonetim.core.utilities.results.SuccessDataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.SuccessResult;
import com.AyhanOzer.HaneYonetim.dataAccess.abstracts.HouseDao;
import com.AyhanOzer.HaneYonetim.entities.concretes.House;

@Repository
public class HouseManager implements HouseService {

	private HouseDao houseDao;
	@Autowired
	public HouseManager(HouseDao houseDao) {
		super();
		this.houseDao = houseDao;
	}

	@Override
	public DataResult<List<House>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<House>>
		(this.houseDao.findAll(),"Tüm aileler(Evler) listelendi");
	}

	@Override
	public Result add(House house) {
		// TODO Auto-generated method stub
		this.houseDao.save(house);
		return new SuccessResult("Yeni aile (Ev) eklendi.");
	}

}
