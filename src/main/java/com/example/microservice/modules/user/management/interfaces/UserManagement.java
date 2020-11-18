package com.example.microservice.modules.user.management.interfaces;

import com.example.microservice.modules.user.model.UserResponseDto;

public interface UserManagement {
	
	public UserResponseDto getUser(String id);
	
}
