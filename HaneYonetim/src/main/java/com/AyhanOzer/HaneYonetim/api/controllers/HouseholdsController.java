package com.AyhanOzer.HaneYonetim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AyhanOzer.HaneYonetim.business.abstracts.HouseholdService;
import com.AyhanOzer.HaneYonetim.core.utilities.results.DataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.Result;
import com.AyhanOzer.HaneYonetim.entities.concretes.Household;
import com.AyhanOzer.HaneYonetim.entities.dtos.HouseHoldsWithHouseAndTitleDto;
import com.AyhanOzer.HaneYonetim.entities.dtos.HouseHoldsWithHouseDto;
import com.AyhanOzer.HaneYonetim.entities.dtos.HouseHoldsWithTitleDto;

@RestController
@RequestMapping("/api/households")
public class HouseholdsController {
	
	private HouseholdService houseHoldService;

	@Autowired
	public HouseholdsController(HouseholdService houseHoldService) {
		super();
		this.houseHoldService = houseHoldService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Household>> getAll(){
		return this.houseHoldService.getAll();
	}
	
	@GetMapping("/gethouseholdswithhouseandtitledetails")
	
	public DataResult<List<HouseHoldsWithHouseAndTitleDto>> getHouseHoldsWithHouseAndTitleDetails(){
		return this.houseHoldService.getHouseHoldsWithHouseAndTitleDetails();
	}
	
	@PostMapping("/add")
	
	public Result add(@RequestBody Household houseHold) {
		return this.houseHoldService.add(houseHold);
	}
	


}
