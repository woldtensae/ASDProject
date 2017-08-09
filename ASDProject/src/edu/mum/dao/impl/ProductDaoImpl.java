package edu.mum.dao.impl;

import edu.mum.dao.ProductDao;
import edu.mum.framework.domain.Product;

public class ProductDaoImpl extends DaoImpl<Product> implements ProductDao{

	public ProductDaoImpl() {
		super(Product.class, Product.class.getSimpleName());
	}

	@Override
	public void remove(String id) {
		for(Product p : this.findAll()){
			if(p.getProductId().equals(id))
				this.findAll().remove(p);
		}
		
	}

	@Override
	public Product update(Product product) {
		for(Product p : this.findAll()){
			if(p.getProductId().equals(product.getProductId())){
				this.findAll().remove(p);
				this.add(product);
			}
		}
		
		return product;
	}

	@Override
	public Product findOne(String id) {
		for(Product p : this.findAll()){
			if(p.getProductId().equals(id))
				return p;
		}
		return null;
	}

	@Override
	public Product findByProductName(String name) {	for(Product p : this.findAll()){
			if(p.getProdcutName().equals(name))
				return p;
		}
		return null;
	}

}
