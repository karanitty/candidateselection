package com.ibsplc.java.day10;

public class NoDocumentException extends RuntimeException{
	
	String message;
	
	public NoDocumentException() {
		// TODO Auto-generated constructor stub
		this.message = "Student does not possess all the documents";
	}

	public NoDocumentException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "NoDocumentException [message=" + message + "]";
	}
	
	

}
