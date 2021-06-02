package com.AyhanOzer.HaneYonetim.business.abstracts;

import java.util.List;

import com.AyhanOzer.HaneYonetim.core.utilities.results.DataResult;
import com.AyhanOzer.HaneYonetim.core.utilities.results.Result;
import com.AyhanOzer.HaneYonetim.entities.concretes.Title;

public interface TitleService {

	DataResult<List<Title>> getAll();
	Result add(Title title);
}
