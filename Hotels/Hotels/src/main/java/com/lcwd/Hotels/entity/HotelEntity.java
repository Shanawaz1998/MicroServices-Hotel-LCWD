package com.lcwd.Hotels.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Hotel_Entity")
public class HotelEntity {

	@Id
	@Column
	private String Hotelid;
	@Column
	private String name;
	
	@Column
	private String location;
	
	@Column
	private String about;
	
}
