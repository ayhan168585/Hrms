package com.AyhanOzer.HaneYonetim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AyhanOzer.HaneYonetim.business.abstracts.HouseService;
import com.AyhanOzer.HaneYonetim.core.utilities.results.DataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.Result;
import com.AyhanOzer.HaneYonetim.entities.concretes.House;

@RestController
@RequestMapping("/api/houses")
public class HousesController {

	private HouseService houseService;

	@Autowired
	public HousesController(HouseService houseService) {
		super();
		this.houseService = houseService;
	}
	@GetMapping("/getall")
	
	public DataResult<List<House>> getAll(){
		return this.houseService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody House house) {
		return this.add(house);
	}
}
