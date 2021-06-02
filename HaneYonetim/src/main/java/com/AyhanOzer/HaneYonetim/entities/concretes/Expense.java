package com.AyhanOzer.HaneYonetim.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="expenses")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","spendings"})

public class Expense {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="spending_id")
	private int spendingId;
	@Column(name="name")
	private String expenseName;
	
	@OneToMany(mappedBy = "expense")
	private List<Spending> spendings;

}
