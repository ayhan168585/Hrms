package com.AyhanOzer.HaneYonetim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AyhanOzer.HaneYonetim.business.abstracts.HouseholdService;
import com.AyhanOzer.HaneYonetim.entities.concretes.Household;

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
	public List<Household> getAll(){
		return this.houseHoldService.getAll();
	}

}
