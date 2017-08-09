package edu.mum.dao.impl.util;

import edu.mum.dao.CategoryDao;
import edu.mum.dao.CredentialDao;
import edu.mum.dao.ProductDao;
import edu.mum.dao.RentDao;
import edu.mum.dao.UserDao;
import edu.mum.dao.impl.CategoryDaoImpl;
import edu.mum.dao.impl.CredentialDaoImpl;
import edu.mum.dao.impl.ProductDaoImpl;
import edu.mum.dao.impl.RentDaoImpl;
import edu.mum.dao.impl.UserDaoImpl;

public class DaoFactory {
	private static volatile CategoryDao categoryDao = null;
	private static volatile CredentialDao credentialDao = null;
	private static volatile ProductDao productDao = null;
	private static volatile RentDao rentDao = null;
	private static volatile UserDao userDao = null;
	
	private DaoFactory(){}

	public static CategoryDao getCategoryDao() {
		if(categoryDao == null)
			categoryDao = new CategoryDaoImpl();
		return categoryDao;
	}

	public static CredentialDao getCredentialDao() {
		if(credentialDao == null)
			credentialDao = new CredentialDaoImpl();
		return credentialDao;
	}

	public static ProductDao getProductDao() {
		if(productDao == null)
			productDao = new ProductDaoImpl();
		return productDao;
	}

	public static RentDao getRentDao() {
		if(rentDao == null)
			rentDao = new RentDaoImpl();
		return rentDao;
	}
	
	public static UserDao getUserDao() {
		if(userDao == null)
			userDao = new UserDaoImpl();
		return userDao;
	}
}
