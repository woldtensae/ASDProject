package edu.mum.framework.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Category implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private String categoryId;
	private String categoryName;
	private List<Product> productList;

	public Category(String categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.productList = new ArrayList<Product>();
	}

	public void addProduct(Product product) {
		productList.add(product);
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}
