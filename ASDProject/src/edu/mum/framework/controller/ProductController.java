package edu.mum.framework.controller;

import edu.mum.framework.domain.Category;
import edu.mum.framework.domain.Product;
import edu.mum.framework.domain.ProductTemplate;
import edu.mum.framework.domain.Unit;
import edu.mum.framework.service.ProductService;
import edu.mum.framework.service.factory.ServiceFactory;
import edu.umu.idGenerator.AutoGenerate;
import edu.umu.idGenerator.IDGenerator;

public class ProductController {
	
	AutoGenerate autoGenerate;
	
	public Product buildProduct(String productName, String productDesc, boolean status, double unitPrice,
			Category category, Unit unit){
		
		autoGenerate = IDGenerator.getInstance();
		String productId = String.valueOf(autoGenerate.getUniqueId(Product.class.getSimpleName()));
		return new ProductTemplate(productName, productId, productDesc, status, unitPrice,
				category, unit);
	}
	
	public ProductService getProductServices(){
		return ServiceFactory.createProductService();
	}
}
