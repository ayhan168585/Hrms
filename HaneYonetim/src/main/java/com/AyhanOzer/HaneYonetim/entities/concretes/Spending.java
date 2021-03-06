package com.AyhanOzer.HaneYonetim.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="spendings")
public class Spending {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
//	@Column(name="expense_id")
//	private int expenseId;
	@Column(name="spending_category_id")
	private int spendingCategoryId;
	@Column(name="product_id")
	private int productId;
	@Column(name="house_hold_id")
	private int houseHoldId;
	@Column(name="name")
	private String spendingName;
	@Column(name="date_of_process")
	private Date dateOfProcess;
	@Column(name="total_price")
	private double totalPrice;
	
	@ManyToOne()
	@JoinColumn(name="expense_id")
	private Expense expense;

}
