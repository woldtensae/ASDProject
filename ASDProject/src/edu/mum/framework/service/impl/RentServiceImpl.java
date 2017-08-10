package edu.mum.framework.service.impl;

import java.time.LocalDate;
import java.util.List;

import edu.mum.framework.dao.RentDao;
import edu.mum.framework.decorator.PriceDecorator;
import edu.mum.framework.domain.AProduct;
import edu.mum.framework.domain.Unit;
import edu.mum.framework.domain.concrete.Rent;
import edu.mum.framework.service.RentService;

public class RentServiceImpl<T,U> implements RentService<T,U> {

    private RentDao rentDao;
    public RentServiceImpl(RentDao rentDao){
    	this.rentDao=rentDao;
    }
	@Override
	public void saveRental(T rent) {
		rentDao.add(rent);
		
	}
	@Override
	public void deleteRent(T rent) {
		rentDao.remove(rent);
		
	}
	@Override
	public void updateCategor(T rent) {

		
	}
	@Override
	public T findOneRent(String id) {
		return (T) rentDao.findRentById(id);
	}
	@Override
	public List<T> findAllRent() {
	return (List<T>) rentDao.findAll();
	}
	@Override
	public double totalRentPrice(T rent) {
		List<AProduct> listRentProduct=((Rent)rent).getRentedProducts();
		double cost=0;
		int rentLenght=0;
		for(AProduct p:listRentProduct)
		{
		    if(p.getUnit()==Unit.DAILY){
		    	//rentLenght=(LocalDate.now().getDayOfYear()- ((Rent)rent).getReturnDate().getDayOfYear()
		    	 if(LocalDate.now().isBefore(((Rent)rent).getReturnDate())) 
		    			 cost+=p.getUnitPrice()* (LocalDate.now().getDayOfYear()- ((Rent)rent).getReturnDate().getDayOfYear());
		    			
		    }
		}
		    
		return cost;
	}
	@Override
	public boolean checkOut(U user, T rent) {
		 
		return false;
	}
	@Override
	public boolean checkIn(U user, T rent) {
	   return false;
	}
	
    
}
