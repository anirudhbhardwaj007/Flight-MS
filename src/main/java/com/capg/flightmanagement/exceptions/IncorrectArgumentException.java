package com.capg.flightmanagement.exceptions;
/**
 * 
 * this class extends the RuntimeException  for making userDefine exception
 *
 */
public class IncorrectArgumentException extends RuntimeException {
	
	public IncorrectArgumentException (String msg)
	{
		super(msg);
	}
}
