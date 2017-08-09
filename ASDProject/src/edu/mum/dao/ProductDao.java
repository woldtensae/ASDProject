package edu.mum.dao;

import edu.mum.framework.domain.Product;

public interface ProductDao extends Dao<Product> {
	public void remove(String id);
	public Product update(Product product);
	public Product findOne(String id);
	public Product findByProductName(String name);
}
