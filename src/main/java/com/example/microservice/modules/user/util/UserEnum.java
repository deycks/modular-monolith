package com.example.microservice.modules.user.util;

public enum UserEnum {
	
	MISSING_PARAM(1000, "Missing parameter");
	
	public static final String PARAM_REQ = "The parameter is required: ";
	public static final String RESPONSE_CODE = "code";
	public static final String RESPONSE_MESSAGE = "message";
	public static final String RESPONSE_DETAIL = "detail";
	
	
	private final int code;
	private final String message;
	
	UserEnum(int code, String message){
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
}
