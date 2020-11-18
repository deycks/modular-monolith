package com.example.microservice.modules.user.model;

public class User {
	
	private String name;
	private Integer id;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	private User(Builder builder) {
		super();
		this.name = builder.name;
		this.id = builder.id;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + "]";
	}
	
	public static final class Builder {
		private String name;
		private Integer id;
		
		private Builder() { }
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder id(Integer id) {
			this.id = id;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
	
}
