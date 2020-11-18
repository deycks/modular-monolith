package com.example.microservice.modules.user.management.impl;

import org.springframework.stereotype.Service;

import com.example.microservice.modules.user.management.interfaces.UserManagement;
import com.example.microservice.modules.user.model.UserResponseDto;
import com.example.microservice.modules.user.model.UserResponseMockupDto;

@Service
public class UserManagementImpl implements UserManagement{

	@Override
	public UserResponseDto getUser(String id) {
		// TODO Generar la implementacion y el response
		return UserResponseMockupDto.generateUser();
	}

}
