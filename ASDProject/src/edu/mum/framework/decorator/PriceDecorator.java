package edu.mum.framework.decorator;

import java.io.Serializable;

public abstract class PriceDecorator<T> implements Serializable{
	
    
	private static final long serialVersionUID = 1L;

	public abstract double getPrice(T rent,double promotion);
}
