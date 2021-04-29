package com.AyhanOzer.HaneYonetim.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AyhanOzer.HaneYonetim.entities.concretes.SpendingCategory;

public interface SpendingCategoryDao extends JpaRepository<SpendingCategory, Integer> {

}
