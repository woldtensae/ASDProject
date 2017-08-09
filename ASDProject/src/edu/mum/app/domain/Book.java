package edu.mum.app.domain;

import java.io.Serializable;

import edu.mum.framework.domain.Category;
import edu.mum.framework.domain.Product;
import edu.mum.framework.domain.Unit;

public class Book extends Product  implements Serializable{
	private static final long serialVersionUID = -5101693623665618963L;
	private String publisher;
	private String yearPub;
	private String shelfNo;
	private String isbn;
	private int availability;
	private int maxCheckoutLength; // change from rentalDay(7/21)
	private String author;
	
	public Book(String productName, String productId, String productDesc, boolean status, double unitPrice,
			Category category, Unit unit, String publisher, String yearPub, String shelfNo, String isbn,
			int availability, int maxCheckoutLength, String author) {
		super(productName, productId, productDesc, status, unitPrice, category, unit);
		this.publisher = publisher;
		this.yearPub = yearPub;
		this.shelfNo = shelfNo;
		this.isbn = isbn;
		this.availability = availability;
		this.maxCheckoutLength = maxCheckoutLength;
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getYearPub() {
		return yearPub;
	}
	public void setYearPub(String yearPub) {
		this.yearPub = yearPub;
	}
	public String getShelfNo() {
		return shelfNo;
	}
	public void setShelfNo(String shelfNo) {
		this.shelfNo = shelfNo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	public int getMaxCheckoutLength() {
		return maxCheckoutLength;
	}
	public void setMaxCheckoutLength(int maxCheckoutLength) {
		this.maxCheckoutLength = maxCheckoutLength;
	}
	
	

}
