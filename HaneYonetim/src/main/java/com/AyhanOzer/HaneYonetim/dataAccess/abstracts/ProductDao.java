package com.AyhanOzer.HaneYonetim.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AyhanOzer.HaneYonetim.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
