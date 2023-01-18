package com.lcwd.Hotels.service;

import java.util.List;

import com.lcwd.Hotels.entity.HotelEntity;

public interface HotelService {

	HotelEntity saveHotels(HotelEntity hotel);
	
	List<HotelEntity> getAllHotels();
	
	HotelEntity getHotelById(String Id);
	
}
