package com.example.microservice.modules.user.model;


public class UserResponseDto {
	
	private String message;
	private Object result;
	
	public void setResult(Object result) {
		this.result = result;
	}

	public Object getResult() {
		return result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	private UserResponseDto(Builder builder) {
		super();
		this.result = builder.result;
		this.message = builder.message;
	}

	@Override
	public String toString() {
		return "UserResponseDto [result=" + result +  ", message: +"+ message +" ]";
	}
	
	public static final class Builder {
		private String message;
		private Object result;
		
		private Builder() { }
		
		public Builder message(String message) {
			this.message = message;
			return this;
		}
		public Builder result(Object result) {
			this.result = result;
			return this;
		}
		
		public UserResponseDto build() {
			return new UserResponseDto(this);
		}
	}

}
