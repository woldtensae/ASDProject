package edu.mum.framework.controller;

import java.time.LocalDate;

import edu.mum.framework.domain.concrete.Rent;
import edu.mum.framework.domain.ARent;
import edu.mum.framework.domain.AUser;
import edu.mum.framework.service.RentService;
import edu.mum.framework.service.factory.ServiceFactory;
import edu.umu.idGenerator.AutoGenerate;
import edu.umu.idGenerator.IDGenerator;

public class RentController {
AutoGenerate autoGenerate;
	
	public Rent buildRent(LocalDate checkoutDate, LocalDate returnDate, AUser user){
		
		autoGenerate = IDGenerator.getInstance();
		String rentId = String.valueOf(autoGenerate.getUniqueId(Rent.class.getSimpleName()));
		return new Rent(rentId, checkoutDate, returnDate, user);
	}
	
	/*public RentService getRentServices(){
		//return ServiceFactory.;
	}*/
}
