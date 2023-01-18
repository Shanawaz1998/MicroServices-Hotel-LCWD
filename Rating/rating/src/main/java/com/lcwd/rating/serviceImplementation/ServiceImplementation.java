package com.lcwd.rating.serviceImplementation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.entity.RatingEntity;
import com.lcwd.rating.repository.RatingRepository;
import com.lcwd.rating.service.RatingService;

@Service
public class ServiceImplementation implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public RatingEntity addRating(RatingEntity ratingEntity) {
		// TODO Auto-generated method stub
		String randomId = UUID.randomUUID().toString();
		ratingEntity.setRatingId(randomId);		
		return ratingRepository.save(ratingEntity);
	}

	@Override
	public List<RatingEntity> getAllRating() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public List<RatingEntity> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelId(hotelId);
	}

	@Override
	public List<RatingEntity> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserId(userId);
	}





}
