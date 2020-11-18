package com.example.microservice.modules.user.model;

public class UserResponseMockupDto {
	
	public static UserResponseDto generateUser() {
		
		return UserResponseDto.builder().message("success").result(User.builder().name("John").id(348963).build()).build();
	}
	
}
