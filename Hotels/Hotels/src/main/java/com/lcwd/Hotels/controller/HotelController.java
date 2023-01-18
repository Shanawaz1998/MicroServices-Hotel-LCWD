package com.lcwd.Hotels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.Hotels.entity.HotelEntity;
import com.lcwd.Hotels.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/")
	public ResponseEntity<HotelEntity> addHotels(@RequestBody HotelEntity hotelEntity)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.saveHotels(hotelEntity));
	}
	
	@GetMapping("/")
	public ResponseEntity<List<HotelEntity>> getAllHotels()
	{
		return ResponseEntity.ok(hotelService.getAllHotels());
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<HotelEntity> getHotelById(@PathVariable String hotelId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotelById(hotelId));
	}
	
	
	
}
