package edu.mum.framework.domain.concrete;

import java.io.Serializable;
import java.time.LocalDate;

import edu.mum.framework.domain.ARent;
import edu.mum.framework.domain.AUser;

public class Rent extends ARent implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Rent(String rentId, LocalDate checkoutDate, LocalDate returnDate, AUser user) {
		super(rentId, checkoutDate, returnDate, user);
	}

}
