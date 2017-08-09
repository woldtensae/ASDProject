package edu.mum.framework.service;

import java.util.List;

import edu.mum.framework.domain.Product;

public interface ProductService {
	public void saveProduct(Product product);
	public void deletProduct(Product product);
	public void updateProductById(Product product);
	public Product findOneProduct(String id);
	public Product findProductByName(String productName);
	public List<Product> findAllProduct();
}
