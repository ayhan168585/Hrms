package com.AyhanOzer.HaneYonetim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AyhanOzer.HaneYonetim.business.abstracts.TitleService;
import com.AyhanOzer.HaneYonetim.entities.concretes.Title;

@RestController
@RequestMapping("/api/titles")
public class TitlesController {
	
	private TitleService titleService;
	@Autowired

	public TitlesController(TitleService titleService) {
		super();
		this.titleService = titleService;
	}
	
	@GetMapping("/getall")
	public List<Title> getAll(){
		return this.titleService.getAll();
	}

}
