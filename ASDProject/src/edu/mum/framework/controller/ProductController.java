package edu.mum.framework.controller;

import edu.mum.framework.domain.concrete.Category;
import edu.mum.framework.domain.concrete.Product;
import edu.mum.framework.generator.id.AutoGenerate;
import edu.mum.framework.generator.id.IDGenerator;
import edu.mum.framework.domain.AProduct;
import edu.mum.framework.domain.Unit;
import edu.mum.framework.service.ProductService;
import edu.mum.framework.service.factory.ServiceFactory;

public class ProductController {
	
	AutoGenerate autoGenerate;
	
	public Product buildProduct(String productName, String productDesc, boolean status, double unitPrice,
			String category, Unit unit){		
		autoGenerate = IDGenerator.getInstance();
		ProductService<Product> productService = getProductServices();
		String productId = String.valueOf(autoGenerate.getUniqueId(Product.class.getSimpleName()));
		Product product = new Product(productName, productId, productDesc, status, unitPrice,
				category, unit);
		productService.saveProduct(product);
		return product;
	}
	
	@SuppressWarnings("unchecked")
	public ProductService<Product> getProductServices(){
		return ServiceFactory.createProductService(Product.class, Product.class.getSimpleName());
	}
}
