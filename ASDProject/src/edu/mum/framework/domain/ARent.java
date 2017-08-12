package edu.mum.framework.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

@SuppressWarnings("rawtypes")
public abstract class ARent<Y> implements Serializable {
	private static final long serialVersionUID = 1L;
	private String rentId;
	private LocalDateTime checkoutDateTime;
	private LocalDateTime returnDateTime;
	private AProduct rentedProduct;
	private double totalRentPrice;
	private AUser user;
	private RentStatus rentStatus;

	public LocalDateTime getCheckoutDateTime() {
		return checkoutDateTime;
	}

	public void setCheckoutDateTime(LocalDateTime checkoutDateTime) {
		this.checkoutDateTime = checkoutDateTime;
	}

	public LocalDateTime getReturnDateTime() {
		return returnDateTime;
	}

	public void setReturnDateTime(LocalDateTime returnDateTime) {
		this.returnDateTime = returnDateTime;
	}

	public AProduct getRentedProduct() {
		return rentedProduct;
	}

	public void setRentedProduct(AProduct rentedProduct) {
		this.rentedProduct = rentedProduct;
	}

	public double getTotalRentPrice() {
		return totalRentPrice;
	}

	public void setTotalRentPrice(double totalRentPrice) {
		this.totalRentPrice = totalRentPrice;
	}

	public ARent(String rentId, LocalDateTime checkoutDateTime, LocalDateTime returnDateTime, AUser user,AProduct rentedProduct) {
		this.rentId = rentId;
		this.checkoutDateTime = checkoutDateTime;
		this.returnDateTime = returnDateTime;
		this.user = user;
		this.rentedProduct=rentedProduct;
		setRentStatus(RentStatus.OPEN);
		this.rentedProduct.setStatus(false);

	}

	public ARent() {

	}

	public String getRentId() {
		return rentId;
	}

	public void setRentId(String rentId) {
		this.rentId = rentId;
	}

	public AUser getUser() {
		return user;
	}

	public void setUser(AUser user) {
		this.user = user;
	}

	public RentStatus getRentStatus() {
		if (this.rentedProduct.isStatus() == false) {
			setRentStatus(RentStatus.OPEN);
			return rentStatus;
		}
		setRentStatus(RentStatus.CLOSED);
		return rentStatus;
	}

	private void setRentStatus(RentStatus rentStatus) {
		this.rentStatus = rentStatus;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rentId == null) ? 0 : rentId.hashCode());
		result = prime * result + ((rentStatus == null) ? 0 : rentStatus.hashCode());
		result = prime * result + ((rentedProduct == null) ? 0 : rentedProduct.hashCode());
		result = prime * result + ((returnDateTime == null) ? 0 : returnDateTime.hashCode());
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
		if (rentId == null) {
			if (other.rentId != null)
				return false;
		} else if (!rentId.equals(other.rentId))
			return false;
		if (rentStatus != other.rentStatus)
			return false;
		if (rentedProduct == null) {
			if (other.rentedProduct != null)
				return false;
		} else if (!rentedProduct.equals(other.rentedProduct))
			return false;
		if (returnDateTime == null) {
			if (other.returnDateTime != null)
				return false;
		} else if (!returnDateTime.equals(other.returnDateTime))
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

}
