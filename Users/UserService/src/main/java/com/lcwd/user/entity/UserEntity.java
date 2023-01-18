package com.lcwd.user.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class UserEntity {
	
	@Id
	@Column
	private String userId;
	
	@Column(length = 20)
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String about;
	
	@Transient  //This annotation is used to ignore storing into the dataBase
	private List<Rating> ratings = new ArrayList<Rating>();
	
	@Transient
	private Hotel hotel;
	
	
	
	
}
