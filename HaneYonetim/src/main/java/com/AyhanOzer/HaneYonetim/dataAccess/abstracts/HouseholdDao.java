package com.AyhanOzer.HaneYonetim.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.AyhanOzer.HaneYonetim.entities.concretes.Household;
import com.AyhanOzer.HaneYonetim.entities.dtos.HouseHoldsWithHouseAndTitleDto;
import com.AyhanOzer.HaneYonetim.entities.dtos.HouseHoldsWithHouseDto;
import com.AyhanOzer.HaneYonetim.entities.dtos.HouseHoldsWithTitleDto;

public interface HouseholdDao extends JpaRepository<Household, Integer>{

	@Query("Select new com.AyhanOzer.HaneYonetim.entities.dtos.HouseHoldsWithHouseAndTitleDto"
			+ "(h.id,h.firstName,h.lastName,ho.houseName,t.titleName)"
			+ " From Household h inner Join h.house ho "
			+ "inner join h.title t ")
	List<HouseHoldsWithHouseAndTitleDto> getHouseHoldsWithHouseAndTitleDetails();
	
	
	
}
