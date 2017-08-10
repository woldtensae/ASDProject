package edu.mum.app.domain;

import java.io.Serializable;

import edu.mum.framework.domain.Product;

public class Audio extends Product{
	   	
	private static final long serialVersionUID = 1L;
	private double NoCDs;
	public double getNoCDs() {
		return NoCDs;
	}
	public void setNoCDs(double noCDs) {
		NoCDs = noCDs;
	}
	
}
