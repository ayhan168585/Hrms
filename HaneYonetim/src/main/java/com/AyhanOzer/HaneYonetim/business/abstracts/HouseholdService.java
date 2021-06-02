package com.AyhanOzer.HaneYonetim.business.abstracts;

import java.util.List;

import com.AyhanOzer.HaneYonetim.core.utilities.results.DataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.Result;
import com.AyhanOzer.HaneYonetim.entities.concretes.Household;
import com.AyhanOzer.HaneYonetim.entities.dtos.HouseHoldsWithHouseAndTitleDto;
import com.AyhanOzer.HaneYonetim.entities.dtos.HouseHoldsWithHouseDto;
import com.AyhanOzer.HaneYonetim.entities.dtos.HouseHoldsWithTitleDto;

public interface HouseholdService {
	
	Result add(Household houseHold);

	DataResult<List<Household>> getAll();

	DataResult<List<HouseHoldsWithHouseAndTitleDto>> getHouseHoldsWithHouseAndTitleDetails();
	
}
