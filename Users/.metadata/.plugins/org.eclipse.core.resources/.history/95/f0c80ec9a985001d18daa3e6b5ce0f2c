package com.lcwd.user.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.user.entity.UserEntity;
import com.lcwd.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	//To create User in the DB
	@PostMapping
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user)	//Takes data in JSON format
	{
		UserEntity saveUser = userService.saveUser(user);	
		return ResponseEntity.status(HttpStatus.CREATED).body(saveUser);
	}
	
	//Get the user by ID
	@GetMapping("/{userId}")
	public ResponseEntity<UserEntity> getUserById(@PathVariable String userId)
	{
		UserEntity userById = userService.getUserById(userId);
		return ResponseEntity.ok(userById);
		
	}
	
	//Get all user								
	@GetMapping("/")
	public ResponseEntity<List<UserEntity>> getAllUser()
	{
		List<UserEntity> allUser = userService.getAllUser();
		return ResponseEntity.ok(allUser);
	}
	
	
}
