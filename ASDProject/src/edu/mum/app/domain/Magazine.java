package edu.mum.app.domain;

import edu.mum.framework.domain.Product;
public class Magazine extends Product{
	   
	private static final long serialVersionUID = 1L;
	private String edition;

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

}
