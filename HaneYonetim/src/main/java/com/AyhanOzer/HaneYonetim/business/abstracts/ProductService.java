package com.AyhanOzer.HaneYonetim.business.abstracts;

import java.util.List;

import com.AyhanOzer.HaneYonetim.entities.concretes.Product;

public interface ProductService {

	List<Product> getAll();
}
