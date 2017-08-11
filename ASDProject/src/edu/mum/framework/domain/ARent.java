package edu.mum.framework.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public abstract class ARent<Y> implements Serializable{
	private static final long serialVersionUID = 1L;
	private String rentId;
	private LocalDate checkoutDate;
	private LocalDate returnDate;
	private List<AProduct> rentedProducts;
	private  double totalRentPrice;
	private AUser user;
	private RentStatus rentStatus;

	public double getTotalRentPrice() {
		return totalRentPrice;
	}

	public void setTotalRentPrice(double totalRentPrice) {
		this.totalRentPrice = totalRentPrice;
	}

	public ARent(String rentId, LocalDate checkoutDate, LocalDate returnDate, AUser user) {
		this.rentId = rentId;
		this.checkoutDate = checkoutDate;
		this.returnDate = returnDate;
		this.user = user;
		this.rentedProducts=new ArrayList<>();
	}
	public ARent()
	{
		
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
	public AUser getUser() {
		return user;
	}
	public void setUser(AUser user) {
		this.user = user;
	}
	public boolean addProduct(AProduct product)
	{
		if (product.isStatus()) {
			rentedProducts.add(product);
			product.setStatus(false);
	      return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "ARent [rentId=" + rentId + ", checkoutDate=" + checkoutDate + ", returnDate=" + returnDate
				+ ", rentedProducts=" + rentedProducts + ", totalRentPrice=" + totalRentPrice + ", user=" + user + "]";
	}

	public List<AProduct> getRentedProducts() {
		return rentedProducts;
	}

	public void setRentedProducts(List<AProduct> rentedProducts) {
		this.rentedProducts = rentedProducts;
	}
    
	public RentStatus getRentStatus() {
	   for(AProduct p: getRentedProducts())
		   if(p.isStatus()==false){
			   setRentStatus(RentStatus.OPEN);
	        return rentStatus;
		   }
			   setRentStatus(RentStatus.CLOSED);
		return rentStatus;
	}
   

	private void setRentStatus(RentStatus rentStatus) {
		this.rentStatus=rentStatus;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkoutDate == null) ? 0 : checkoutDate.hashCode());
		result = prime * result + ((rentId == null) ? 0 : rentId.hashCode());
		result = prime * result + ((rentedProducts == null) ? 0 : rentedProducts.hashCode());
		result = prime * result + ((returnDate == null) ? 0 : returnDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalRentPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ARent other = (ARent) obj;
		if (checkoutDate == null) {
			if (other.checkoutDate != null)
				return false;
		} else if (!checkoutDate.equals(other.checkoutDate))
			return false;
		if (rentId == null) {
			if (other.rentId != null)
				return false;
		} else if (!rentId.equals(other.rentId))
			return false;
		if (rentedProducts == null) {
			if (other.rentedProducts != null)
				return false;
		} else if (!rentedProducts.equals(other.rentedProducts))
			return false;
		if (returnDate == null) {
			if (other.returnDate != null)
				return false;
		} else if (!returnDate.equals(other.returnDate))
			return false;
		if (Double.doubleToLongBits(totalRentPrice) != Double.doubleToLongBits(other.totalRentPrice))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	public <T> double getPrice(Y rentservice, T rent) {
		return 0;
	}
	
}
