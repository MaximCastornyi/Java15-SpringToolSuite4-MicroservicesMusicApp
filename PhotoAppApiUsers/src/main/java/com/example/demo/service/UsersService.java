package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.example.demo.shared.*;

public interface UsersService extends UserDetailsService{
	UserDto createUser(UserDto userDetails);
	UserDto getUserDetailsByEmail(String email);
	UserDto getUserByUserId(String userId);
}
