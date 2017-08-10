package edu.mum.framework.domain;

import java.io.Serializable;
import java.time.LocalDate;

public class RentTemplate extends Rent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public RentTemplate(String rentId, LocalDate checkoutDate, LocalDate returnDate, User user) {
		super(rentId, checkoutDate, returnDate, user);
	}
	
}
