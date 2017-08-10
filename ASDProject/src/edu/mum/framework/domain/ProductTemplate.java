package edu.mum.framework.domain;

import java.io.Serializable;

public class ProductTemplate extends Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductTemplate(String productName, String productId, String productDesc, boolean status, double unitPrice,
			Category category, Unit unit) {
		super(productName, productId, productDesc, status, unitPrice,
				category, unit);
	}
}
