package com.AyhanOzer.HaneYonetim.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.AyhanOzer.HaneYonetim.business.abstracts.HouseholdService;
import com.AyhanOzer.HaneYonetim.core.utilities.results.DataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.Result;
import com.AyhanOzer.HaneYonetim.core.utilities.results.SuccessDataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.SuccessResult;
import com.AyhanOzer.HaneYonetim.dataAccess.abstracts.HouseholdDao;
import com.AyhanOzer.HaneYonetim.entities.concretes.Household;
import com.AyhanOzer.HaneYonetim.entities.dtos.HouseHoldsWithHouseAndTitleDto;
import com.AyhanOzer.HaneYonetim.entities.dtos.HouseHoldsWithHouseDto;
import com.AyhanOzer.HaneYonetim.entities.dtos.HouseHoldsWithTitleDto;

@Repository
public class HouseholdManager implements HouseholdService {

	private HouseholdDao houseHoldDao;
	@Autowired
	public HouseholdManager(HouseholdDao houseHoldDao) {
		super();
		this.houseHoldDao = houseHoldDao;
	}
	
	@Override
	public Result add(Household houseHold) {
		// TODO Auto-generated method stub
		this.houseHoldDao.save(houseHold);
		return new SuccessResult("Yeni bir ev halkı kişisi eklendi.");
	}
	@Override
	public DataResult<List<Household>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Household>>
				(this.houseHoldDao.findAll(),"Ev halkı listelendi.");
	}
	@Override
	public DataResult<List<HouseHoldsWithHouseAndTitleDto>> getHouseHoldsWithHouseAndTitleDetails() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<HouseHoldsWithHouseAndTitleDto>>
		(this.houseHoldDao.getHouseHoldsWithHouseAndTitleDetails(),"Ev ayrıntısı listelendi.");
	}

	

}
