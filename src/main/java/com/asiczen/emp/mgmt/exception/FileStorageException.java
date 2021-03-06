package com.asiczen.emp.mgmt.exception;

public class FileStorageException extends RuntimeException {

	private static final long serialVersionUID = 1962436377162224050L;

	public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}