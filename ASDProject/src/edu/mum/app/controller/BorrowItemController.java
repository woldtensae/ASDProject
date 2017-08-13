package edu.mum.app.controller;

import edu.mum.framework.controller.RentController;
import edu.mum.framework.domain.AProduct;

public class BorrowItemController extends RentController<AProduct>{

	public BorrowItemController(Class<AProduct> classType) {
		super(classType);
	}
	
}
