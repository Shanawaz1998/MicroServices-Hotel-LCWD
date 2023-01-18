package com.lcwd.user.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lcwd.user.entity.Hotel;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {


	@GetMapping("/hotels/{hotelId}")
	Hotel getHotelById(@PathVariable("hotelId") String hotelId);
	
}
