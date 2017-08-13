package edu.mum.framework.controller;

import java.time.LocalDateTime;

import edu.mum.framework.domain.AProduct;
import edu.mum.framework.domain.ARent;
import edu.mum.framework.domain.AUser;
import edu.mum.framework.domain.concrete.Rent;
import edu.mum.framework.generator.id.AutoGenerate;
import edu.mum.framework.generator.id.IDGenerator;
import edu.mum.framework.service.ProductService;
import edu.mum.framework.service.RentService;
import edu.mum.framework.service.factory.ServiceFactory;


public class RentController<T>{
AutoGenerate autoGenerate;

Class<T> classType;


public RentController(Class<T> classType){
	this.classType = classType;
}
	
	public ARent<T> buildRent(LocalDateTime checkoutDate, LocalDateTime returnDate, AUser user, 
			AProduct product){
		
		autoGenerate = IDGenerator.getInstance();
		String rentId = String.valueOf(autoGenerate.getUniqueId(Rent.class.getSimpleName()));
		return new Rent(rentId, checkoutDate, returnDate, user, product);
	}
	
	@SuppressWarnings("unchecked")
	public RentService<T> getProductServices(){
		return ServiceFactory.createRenttService(classType.getClass(), 
				classType.getClass().getSimpleName());
	}
}
