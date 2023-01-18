package com.lcwd.rating.service;

import java.util.List;

import com.lcwd.rating.entity.RatingEntity;

public interface RatingService {
	
	//Add Rating
	RatingEntity addRating(RatingEntity ratingEntity);
	
	//Get All rating
	List<RatingEntity> getAllRating();
	
	//Get Rating by HotelId
	List<RatingEntity> getRatingByHotelId(String hotelId);

	//Get All by userID
	List<RatingEntity> getRatingByUserId(String UserId);
}
