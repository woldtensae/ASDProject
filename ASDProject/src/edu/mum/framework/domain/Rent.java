package edu.mum.framework.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public abstract class Rent implements Serializable{
	   
	
/**
* 
*/
private static final long serialVersionUID = 1L;
	private String rentId;
	private LocalDate checkoutDate;
	private LocalDate returnDate;
	private List<Product> rentedProducts;
	private  double totalRentPrice;
	private User user;
		
	
	public double getTotalRentPrice() {
		return totalRentPrice;
	}

	public void setTotalRentPrice(double totalRentPrice) {
		this.totalRentPrice = totalRentPrice;
	}

	public Rent(String rentId, LocalDate checkoutDate, LocalDate returnDate, User user) {
		this.rentId = rentId;
		this.checkoutDate = checkoutDate;
		this.returnDate = returnDate;
		this.user = user;
	}
	 
	public Rent() {
		
	}

	public String getRentId() {
		return rentId;
	}
	public void setRentId(String rentId) {
		this.rentId = rentId;
	}
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void addProduct(Product product)
	{
		rentedProducts.add(product);
	}
}
