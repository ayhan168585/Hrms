package com.AyhanOzer.HaneYonetim.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.AyhanOzer.HaneYonetim.business.abstracts.TitleService;
import com.AyhanOzer.HaneYonetim.dataAccess.abstracts.TitleDao;
import com.AyhanOzer.HaneYonetim.entities.concretes.Title;

@Repository
public class TitleManager implements TitleService{

	private TitleDao titleDao;
	@Autowired
	public TitleManager(TitleDao titleDao) {
		super();
		this.titleDao = titleDao;
	}
	@Override
	public List<Title> getAll() {
		// TODO Auto-generated method stub
		return titleDao.findAll();
	}

}
