package edu.mum.framework.decorator;

import edu.mum.framework.domain.concrete.Rent;

public class PastDueFee<T> extends PriceDecorator<T>{
	
	private static final long serialVersionUID = 1L;
	private T rent;
	public PastDueFee(T rent)
	{
		
		this.rent=rent;
	}
	
	@Override
	public double getPrice(T rent, double passDue) {
		return ((Rent)rent).getTotalRentPrice()- ((((Rent)rent).getTotalRentPrice()* passDue)/100);
	}

	

	
}
