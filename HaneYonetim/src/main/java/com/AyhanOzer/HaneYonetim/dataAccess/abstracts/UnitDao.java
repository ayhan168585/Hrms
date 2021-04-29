package com.AyhanOzer.HaneYonetim.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AyhanOzer.HaneYonetim.entities.concretes.Unit;


public interface UnitDao extends JpaRepository<Unit,Integer> {

}
