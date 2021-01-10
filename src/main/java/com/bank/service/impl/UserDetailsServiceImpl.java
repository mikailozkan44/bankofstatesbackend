package com.bank.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Take user name from login page & validate through database
		//if user is valid then return UserDetails object
		return null;
	}
	
	

}
