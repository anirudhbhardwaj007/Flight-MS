package com.capg.flightmanagement.exceptions;
/**
 * 
 * this class extends the RuntimeException  for making userDefine exception
 *
 */

public class IncorrectIdException extends RuntimeException {
	public IncorrectIdException(String msg)
	{
		super(msg);
	}

}
