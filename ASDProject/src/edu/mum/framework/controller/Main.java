package edu.mum.framework.controller;

import edu.mum.framework.domain.Unit;
import edu.mum.framework.domain.concrete.Product;
import edu.mum.framework.service.ProductService;

public class Main {
	public static void main(String[] str){
		UserController uc = UserController.getUserController();
		UserDirector ud = uc.getUserDirector();
		
		/*ud.userInfo(LocalDate.of(1981, 12, 18), "name3","name3", "22222222");
		ud.userAddress("22222", "addisAbaba", "Checkos", 2345);
		ud.userCredential("meron", "tolosa", Role.MEMBER);
		User user = ud.createFullUser();*/
		
		//System.out.println(user);	
		//System.out.println(uc.getUserServices().findOneUser(user.getId()));
		
		
		
		ProductController  productController = new ProductController();
		/*Product product = productController.buildProduct("book", "ASD", true, 9, "book", Unit.HOURLY);
		ProductController  productController = new ProductController();
		Product product = productController.buildProduct("book1", "Sport", true, 10, "Megazine", Unit.DAILY);*/
		
		ProductService<Product> productService = productController.getProductServices();
		//System.out.println(productService.findOneProduct(product.getProductId()));
		System.out.println(productService.findAllProduct());
		
		
		/*LoginController lc = new LoginController();
		System.out.println(lc.authenticateUser("aman", "estifanos"))*/;
	}
}