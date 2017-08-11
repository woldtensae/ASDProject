package edu.mum.framework.domain.concrete;

import java.io.Serializable;

import edu.mum.framework.domain.AProduct;
import edu.mum.framework.domain.Unit;

public class Product extends AProduct implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	public Product(String productName, String productId, String productDesc, boolean status, double unitPrice,
			String category, Unit unit) {
		super(productName, productId, productDesc, status, unitPrice, category, unit);
		
	}


}
