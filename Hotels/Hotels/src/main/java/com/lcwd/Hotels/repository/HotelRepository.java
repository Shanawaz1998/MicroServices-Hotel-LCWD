package com.lcwd.Hotels.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.Hotels.entity.HotelEntity;

public interface HotelRepository extends JpaRepository<HotelEntity, String>{

}
