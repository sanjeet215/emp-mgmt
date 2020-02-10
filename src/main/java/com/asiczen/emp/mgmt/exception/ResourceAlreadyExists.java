package com.asiczen.emp.mgmt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceAlreadyExists extends RuntimeException {

	private static final long serialVersionUID = 7857705686771762335L;

	public ResourceAlreadyExists() {
		super();
	}

	public ResourceAlreadyExists(String message) {
		super(message);
	}

	public ResourceAlreadyExists(String message, Throwable cause) {
		super(message, cause);
	}

}
