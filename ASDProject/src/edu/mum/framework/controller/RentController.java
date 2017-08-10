package edu.mum.framework.controller;

import java.time.LocalDate;

import edu.mum.framework.domain.Rent;
import edu.mum.framework.domain.RentTemplate;
import edu.mum.framework.domain.User;
import edu.mum.framework.service.RentService;
import edu.mum.framework.service.factory.ServiceFactory;
import edu.umu.idGenerator.AutoGenerate;
import edu.umu.idGenerator.IDGenerator;

public class RentController {
AutoGenerate autoGenerate;
	
	public Rent buildRent(LocalDate checkoutDate, LocalDate returnDate, User user){
		
		autoGenerate = IDGenerator.getInstance();
		String rentId = String.valueOf(autoGenerate.getUniqueId(Rent.class.getSimpleName()));
		return new RentTemplate(rentId, checkoutDate, returnDate, user);
	}
	
	/*public RentService getRentServices(){
		return ServiceFactory.;
	}*/
}
