package edu.mum.framework.domain;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Product implements Serializable{
		   
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	       private String productName;
		   private String productId;
		   private String productDesc;
		   private boolean status; 
		   private double unitPrice;
		   private Category category;
		   private Unit unit;
		   
		public Product(String productName, String productId, String productDesc, boolean status, double unitPrice,
				Category category, Unit unit) {
			this.productName = productName;
			this.productId = productId;
			this.productDesc = productDesc;
			this.status = status;
			this.unitPrice = unitPrice;
			this.category = category;
			this.unit = unit;
		}
		public Product() {
			
		}
		public String getProdcutName() {
			return productName;
		}
		public void setProdcutName(String productName) {
			this.productName = productName;
		}
		public String getProductId() {
			return productId;
		}
		public void setProductId(String productId) {
			this.productId = productId;
		}
		public String getProductDisc() {
			return productDesc;
		}
		public void setProductDisc(String productDisc) {
			this.productDesc = productDisc;
		}



		public String getProductDesc() {
			return productDesc;
		}



		public void setProductDesc(String productDesc) {
			this.productDesc = productDesc;
		}



		public boolean isStatus() {
			return status;
		}



		public void setStatus(boolean status) {
			this.status = status;
		}
		
		
		      
}
