package edu.mum.framework.dao;

import edu.mum.framework.domain.Product;

public interface ProductDao extends Dao<Product> {
  public Product findByProductName(String name);
}
