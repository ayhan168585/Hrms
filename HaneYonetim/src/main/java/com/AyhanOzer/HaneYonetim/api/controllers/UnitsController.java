package com.AyhanOzer.HaneYonetim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AyhanOzer.HaneYonetim.business.abstracts.UnitService;
import com.AyhanOzer.HaneYonetim.entities.concretes.Unit;


@RestController
@RequestMapping(value="/api/units")
public class UnitsController {
	
	private UnitService unitService;

	@Autowired
	public UnitsController(UnitService unitService) {
		super();
		this.unitService = unitService;
	}
	
	@GetMapping("/getall")
	public List<Unit> getAll(){
		
		return this.unitService.getAll();
	}

}
