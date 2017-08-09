package edu.mum.framework.service.factory;
import edu.mum.dao.impl.util.DaoFactory;
import edu.mum.framework.service.CategoryService;
import edu.mum.framework.service.CredentialService;
import edu.mum.framework.service.ProductService;
import edu.mum.framework.service.UserService;
import edu.mum.framework.service.impl.CategoryServiceImpl;
import edu.mum.framework.service.impl.CredentialServiceImpl;
import edu.mum.framework.service.impl.ProductServiceImpl;
import edu.mum.framework.service.impl.UserServiceImpl;

public class ServiceFactory {
	private static volatile ProductService productService;
	private static volatile UserService userService;
	private static volatile CategoryService categoryService;
	private static volatile CredentialService credentialService;
	
	public static ProductService createProductService() {
		if(null == productService) {
			synchronized(ServiceFactory.class) {
				if(null == productService) {
					
					ProductService productServiceImpl = new ProductServiceImpl(DaoFactory.getProductDao());
					productService = productServiceImpl;
				}
			}
		}
		
		return productService;
	}
	
	public static UserService createUserService() {
		if(null == userService) {
			synchronized(ServiceFactory.class) {
				if(null == userService) {
					UserService userServiceImpl =new UserServiceImpl(DaoFactory.getUserDao());
				userService = userServiceImpl;

		    }
		}
	}
		return userService;
  }
	
	
	public static CategoryService createCategoryService() {
		if(null == categoryService) {
			synchronized(ServiceFactory.class) {
				if(null == categoryService) {
			            CategoryService categoryServiceImpl = new CategoryServiceImpl(DaoFactory.getCategoryDao());
					categoryService = categoryServiceImpl;
				}
			}
		}
		return categoryService;
	}
	
	public static CredentialService  createCredentialService() {
		if(null == credentialService) {
			synchronized(ServiceFactory.class) {
				if(null == credentialService) {
					   CredentialService categoryServiceImpl = new CredentialServiceImpl(DaoFactory.getCredentialDao());
			            credentialService = categoryServiceImpl;
				}
			}
		}
		return credentialService;
	}
}
