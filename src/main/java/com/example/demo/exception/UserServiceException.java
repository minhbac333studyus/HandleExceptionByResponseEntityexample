package com.example.demo.exception;

public class UserServiceException  extends RuntimeException{ 
	private static final long serialVersionUID = 8562360970811092186L; 
	public UserServiceException(String message) {
		super(message);
	}
}
