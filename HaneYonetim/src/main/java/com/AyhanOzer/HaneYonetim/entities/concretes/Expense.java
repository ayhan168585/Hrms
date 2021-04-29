package com.AyhanOzer.HaneYonetim.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="expenses")
public class Expense {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="spending_id")
	private int spendingId;
	@Column(name="name")
	private String name;

}
