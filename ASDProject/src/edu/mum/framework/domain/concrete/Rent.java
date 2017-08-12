package edu.mum.framework.domain.concrete;

import java.time.LocalDateTime;

import edu.mum.framework.domain.AProduct;
import edu.mum.framework.domain.ARent;
import edu.mum.framework.domain.AUser;

public class Rent extends ARent{

	public Rent(String rentId, LocalDateTime checkoutDate, LocalDateTime returnDate,
			AUser user, AProduct product) {
		super(rentId, checkoutDate, returnDate, user, product);
		
	}

}
