package com.example.library.exception;

public class BookNotFoundException extends RuntimeException {

	public static final String HttpStatus = null;
	private String message = "Not found";

	public BookNotFoundException(String message) {
		super(message);
		this.message = message;
	}

	public BookNotFoundException() {

	}

	public BookNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
