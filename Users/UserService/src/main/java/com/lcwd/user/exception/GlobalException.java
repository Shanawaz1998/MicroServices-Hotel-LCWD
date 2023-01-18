package com.lcwd.user.exception;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.lcwd.user.exception.ApiEntity;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiEntity> handlerResourceNotFoundException(ResourceNotFoundException ex)
	{
		String message = ex.getMessage();	//Message received from ResourceNotFoundException Class
		ApiEntity reponse = ApiEntity.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build(); //build() method is used to create the object
		
		return new ResponseEntity<ApiEntity>(reponse, HttpStatus.NOT_FOUND);
	}
	
}
