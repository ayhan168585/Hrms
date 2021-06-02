package com.AyhanOzer.HaneYonetim.business.abstracts;

import java.util.List;

import com.AyhanOzer.HaneYonetim.core.utilities.results.DataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.Result;
import com.AyhanOzer.HaneYonetim.entities.concretes.House;

public interface HouseService {

	DataResult<List<House>> getAll();
	Result add(House house);
}
