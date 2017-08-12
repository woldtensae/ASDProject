package edu.mum.framework.service.impl;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.mum.framework.dao.ProductDao;
import edu.mum.framework.dao.RentDao;
import edu.mum.framework.decorator.PastDueFee;
import edu.mum.framework.decorator.PriceDecorator;
import edu.mum.framework.decorator.PromotionDecorator;
import edu.mum.framework.domain.AProduct;
import edu.mum.framework.domain.AUser;
import edu.mum.framework.domain.Unit;
import edu.mum.framework.domain.concrete.Rent;
import edu.mum.framework.service.RentService;

@SuppressWarnings({ "unused", "unchecked" })
public class RentServiceImpl<T> implements RentService<T> {

	private RentDao<T> rentDao;
	private ProductDao<T> productDao;
	private RentService<T> rentService;

	public RentServiceImpl(RentDao<T> rentDao) {
		this.rentDao = rentDao;
		
	}

	@Override
	public void saveRental(T rent) {
		
		((Rent)rent).getRentedProduct().setStatus(false);

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
		return rentDao.findRentById(id);
	}

	@Override
	public List<T> findAllRent() {
		System.out.println((List<Rent>)rentDao.findAll());
		return (List<T>) rentDao.findAll();
	}

	
	@Override
	public Long totalRentPrice(T rent) {
		
		long rentCost=0;
        Rent r=(Rent)rent;
			if (r.getRentedProduct().getUnit() == Unit.DAILY) {
			  long days = Duration.between(((Rent)rent).getReturnDateTime(), ((Rent)rent).getCheckoutDateTime()).toDays();
				rentCost = (long) (r.getRentedProduct().getUnitPrice() * days);
			}
			if (r.getRentedProduct().getUnit() == Unit.HOURLY){
				Long hr=Duration.between(((Rent)rent).getReturnDateTime(), ((Rent)rent).getCheckoutDateTime()).toHours();
				rentCost = (long) (r.getRentedProduct().getUnitPrice() * hr);
			}
				
		
		return rentCost;
		
	}
		
	

	@Override
	public boolean checkOut(T rent) {
		if(((Rent)rent).getRentedProduct().isStatus())
		return false;
		else 
			((Rent)rent).getRentedProduct().setStatus(false);
		return true;
	}

	@Override
	public boolean returnProduct(T rent) {
		if(((Rent) rent).getRentedProduct().isStatus())
           return false;
		else 
			((Rent)rent).getRentedProduct().setStatus(false);
		     return true;
	}
	
	@Override
	public 	List<AProduct> borrowedItemByUser(AUser user) {
		System.out.println("User form Method "+user);
		List<AProduct> list = new ArrayList<>();
		return ((List<Rent>) rentDao.findAll()).stream()
										.filter(x->x.getUser().getId().equals(user.getId()))
										.map(y->y.getRentedProduct())
										.collect(Collectors.toList());
		
	} 

	@Override
	public List<AProduct> returnedItemByUser(AUser user) {
		List<AProduct> list = new ArrayList<>();
		return ((List<Rent>) rentDao.findAll()).stream()
										.filter(x->x.getUser().getId().equals(user.getId())
												 && x.getRentedProduct().isStatus()==true)
										.map(y->y.getRentedProduct())
										.collect(Collectors.toList());
		 
		
		}

	@Override
	public List<AProduct> ItemNotReturnedByUser(AUser user) {
		List<AProduct> list = new ArrayList<>();
		return ((List<Rent>) rentDao.findAll()).stream()
										.filter(x->x.getUser().getId().equals(user.getId())
												 && x.getRentedProduct().isStatus()==false)
										.map(y->y.getRentedProduct())
										.collect(Collectors.toList());
		 
	}

	
  
}
