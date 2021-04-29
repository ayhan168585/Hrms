package com.AyhanOzer.HaneYonetim.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AyhanOzer.HaneYonetim.entities.concretes.Title;

public interface TitleDao extends JpaRepository<Title, Integer>{

}
