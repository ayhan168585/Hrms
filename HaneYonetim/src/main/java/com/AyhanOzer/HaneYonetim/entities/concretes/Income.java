package com.AyhanOzer.HaneYonetim.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="incomes")
public class Income {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="type_of_income_id")
	private int typeOfIncomeId;
	
	@Column(name="house_hold_id")
	private int houseHoldId;
	
	@Column(name="quantity")
	private double quantity;
	
	@Column(name="date_of_process")
	private Date dateOfProcess;
}
