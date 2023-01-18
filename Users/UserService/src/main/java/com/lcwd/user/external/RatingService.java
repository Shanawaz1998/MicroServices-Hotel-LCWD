package com.lcwd.user.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lcwd.user.entity.Rating;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

	//get
	
	
	//post
	@PostMapping("/ratings")
	ResponseEntity<Rating> createRating(Rating rating);
	
	
	//put
	@PutMapping("/ratings/{ratingId}")
	ResponseEntity<Rating> updateRating(@PathVariable String ratingId, Rating rating);
	
	//Delete
	@DeleteMapping("/ratings/{ratingId}")
	ResponseEntity<Rating> deleteRating(@PathVariable String ratingId);
	
}
