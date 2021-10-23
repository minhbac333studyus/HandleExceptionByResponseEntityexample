package com.example.demo.exception;
 

public class ResourceNotFoundException extends RuntimeException{  
	private static final long serialVersionUID = 2949634846500104634L;
	public ResourceNotFoundException() {
		super();
	}
	public ResourceNotFoundException(String message) {
		super(message);
	}
	public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}