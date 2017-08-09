package edu.mum.framework.service.impl;

import java.util.List;

import edu.mum.dao.ProductDao;
import edu.mum.framework.domain.Product;
import edu.mum.framework.service.ProductService;

public class ProductServiceImpl implements ProductService{
     private ProductDao productDao;
     
     public ProductServiceImpl(ProductDao productDao){
    	 this.productDao=productDao;
     }
	
	@Override
	public void saveProduct(Product product) {
		productDao.add(product);
		
	}

	@Override
	public void deletProduct(Product product) {
		productDao.remove(product);
		
	}

	@Override
	public Product findOneProduct(String id) {
		return productDao.findOne(id);
	}

	@Override
	public Product findProductByName(String productName) {
		return productDao.findByProductName(productName);
	}

	@Override
	public List<Product> findAllProduct() {
		return productDao.findAll();
	}
	@Override
	public void updateProductById(Product product) {
		productDao.update(product);
		
	}

}
