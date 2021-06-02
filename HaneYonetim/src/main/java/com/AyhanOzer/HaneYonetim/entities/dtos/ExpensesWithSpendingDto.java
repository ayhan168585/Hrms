package com.AyhanOzer.HaneYonetim.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpensesWithSpendingDto {

	private int id;
	private String spendingName;
	private Date dateOfProcess;
	private double totalPrice;
	private String expenseName;

}
