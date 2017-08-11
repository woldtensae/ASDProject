package edu.mum.framework.decorator;
import edu.mum.framework.domain.concrete.Rent;



public class PromotionDecorator<T> extends PriceDecorator<T>  {
    
	private static final long serialVersionUID = 1L;
	private T rent;
	
	public PromotionDecorator(T rent)
	{
		
		this.rent=rent;
	}
	
	@Override
	public double getPrice( T rent,double promotion) {
		return ((Rent)rent).getTotalRentPrice()- ((((Rent)rent).getTotalRentPrice()* promotion)/100);
	}

}
