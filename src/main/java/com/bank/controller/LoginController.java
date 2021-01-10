package com.bank.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.request.SignUpForm;
import com.bank.response.Response;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController("/auth")
@RequestMapping("/auth")
public class LoginController {
	
	@PostMapping("/login")
	public ResponseEntity<Response> registerUser(@Valid @RequestBody LoginForm loginRequest){
		
		
	}
	
	public ResponseEntity<Response> registerUser(@Valid @RequestBody SignUpForm signUpRequest){
		
	}

}

