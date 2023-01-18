package com.lcwd.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.rating.entity.RatingEntity;

public interface RatingRepository extends JpaRepository<RatingEntity,String > {

	List<RatingEntity> findByUserId(String userId);
	List<RatingEntity> findByHotelId(String hotelId);
	
}
