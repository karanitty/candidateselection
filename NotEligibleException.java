package com.ibsplc.java.day10;

public class NotEligibleException extends RuntimeException{
	
	String message;

	public NotEligibleException(String message) {
		super();
		this.message = message;
	}
	
	public NotEligibleException() {
		// TODO Auto-generated constructor stub
		this.message = "Student is not eligible";
	}

	@Override
	public String toString() {
		return "NotEligibleException [message=" + message + "]";
	}
}