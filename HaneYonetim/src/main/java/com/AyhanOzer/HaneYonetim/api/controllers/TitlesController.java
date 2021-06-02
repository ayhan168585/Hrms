package com.AyhanOzer.HaneYonetim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AyhanOzer.HaneYonetim.business.abstracts.TitleService;
import com.AyhanOzer.HaneYonetim.core.utilities.results.DataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.Result;
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
	public DataResult<List<Title>> getAll(){
		return this.titleService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Title title) {
		return this.titleService.add(title);
	}

}
