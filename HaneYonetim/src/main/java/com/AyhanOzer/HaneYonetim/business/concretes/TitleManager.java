package com.AyhanOzer.HaneYonetim.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.AyhanOzer.HaneYonetim.business.abstracts.TitleService;
import com.AyhanOzer.HaneYonetim.core.utilities.results.DataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.Result;
import com.AyhanOzer.HaneYonetim.core.utilities.results.SuccessDataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.SuccessResult;
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
	public DataResult<List<Title>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Title>>
		(this.titleDao.findAll(),"Ünvanlar listelendi.");
	}
	@Override
	public Result add(Title title) {
		// TODO Auto-generated method stub
		this.titleDao.save(title);
		return new SuccessResult("Yeni bir ünvan eklendi.");
	}
	

}
