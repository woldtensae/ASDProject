package edu.mum.framework.controller;

import edu.mum.framework.domain.concrete.Category;
import edu.mum.framework.domain.concrete.Product;
import edu.mum.framework.domain.AProduct;
import edu.mum.framework.domain.Unit;
import edu.mum.framework.service.ProductService;
import edu.mum.framework.service.factory.ServiceFactory;
import edu.umu.idGenerator.AutoGenerate;
import edu.umu.idGenerator.IDGenerator;

public class ProductController {
	
	AutoGenerate autoGenerate;
	
	public Product buildProduct(String productName, String productDesc, boolean status, double unitPrice,
			String category, Unit unit){		
		autoGenerate = IDGenerator.getInstance();
		String productId = String.valueOf(autoGenerate.getUniqueId(Product.class.getSimpleName()));
		return new Product(productName, productId, productDesc, status, unitPrice,
				category, unit);
	}
	
	@SuppressWarnings("unchecked")
	public ProductService<Product> getProductServices(){
		return ServiceFactory.createProductService(Product.class, Product.class.getSimpleName());
	}
}
