package com.lcwd.Hotels.HotelServiceImplementation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.Hotels.entity.HotelEntity;
import com.lcwd.Hotels.exception.ResourceNotFoundException;
import com.lcwd.Hotels.repository.HotelRepository;
import com.lcwd.Hotels.service.HotelService;

@Service
public class HotelServiceImplementation implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public HotelEntity saveHotels(HotelEntity hotel) {
		// TODO Auto-generated method stub
		String randomID = UUID.randomUUID().toString();
		hotel.setHotelid(randomID);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<HotelEntity> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public HotelEntity getHotelById(String Id) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Hotel not available of this id"));
	}


}
