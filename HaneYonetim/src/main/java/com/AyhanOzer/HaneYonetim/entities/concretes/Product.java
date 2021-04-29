package com.AyhanOzer.HaneYonetim.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="products")
public class Product {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="product_category_id")
	private int productCategoryId;
	@Column(name="unit_id")
	private int unitId;
	@Column(name="name")
	private String name;
	@Column(name="quantity")
	private double quantity;
	@Column(name="price")
	private double price;
}
