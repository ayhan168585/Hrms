package com.AyhanOzer.HaneYonetim.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HouseHoldsWithHouseAndTitleDto {

	private int id;
	private String firstName;
	private String lastName;
	private String houseName;
	private String titleName;
	
}
