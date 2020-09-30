package com.poo.jdbc.dao;

@SuppressWarnings("serial")
public class DAOException extends RuntimeException {

	public DAOException(String msg, Throwable t) {
		super(msg, t);
	}
}
