package com.AyhanOzer.HaneYonetim.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="house_holds")
public class Household {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="house_hold_id")
	private int houseHoldId;
//	@Column(name="title_id")
//	private int titleId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="telephone")
	private String telephone;
	
	@ManyToOne()
	@JoinColumn(name="house_id")
	private House house;
	
	@ManyToOne()
	@JoinColumn(name="title_id")
	private Title title;

}
