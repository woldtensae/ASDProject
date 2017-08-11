package edu.mum.framework.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import edu.mum.framework.dao.ProductDao;
import edu.mum.framework.domain.AProduct;
import edu.mum.framework.service.ProductService;

@SuppressWarnings("unchecked")
public class ProductServiceImpl<T> implements ProductService<T>{
     private ProductDao<T> productDao;
     
     public ProductServiceImpl(ProductDao<T> productDao)
     {
    	 this.productDao=productDao;
     }

	@Override
	public void saveProduct(T product) {
		productDao.add(product);
	}

	@Override
	public void deleteProduct(T product) {
		productDao.remove(product);
		
	}

	@Override
	public T findOneProduct(String id) {
		return (T) productDao.findOne(id);
	}

	@Override
	public T findProductByName(String productName) {
		return (T) productDao.findByProductName(productName);
	}

	@Override
	public List<T> findAllProduct() {
		List<T> list=productDao.findAll();
		return list;
	}

	@Override
	public void updateProductById(T product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> avalibleProductforRent() {
		List<AProduct> list=(List<AProduct>) findAllProduct();
		return (List<T>) list.stream().filter(x->x.isStatus()==true).collect(Collectors.toList());
	}

	@Override
	public List<T> RentedProduct() {
		List<AProduct> list=(List<AProduct>) findAllProduct();
		return (List<T>) list.stream().filter(x->x.isStatus()==false).collect(Collectors.toList());
	}
	
}
