package edu.mum.framework.controller;


import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.List;

import edu.mum.framework.domain.AUser;
import edu.mum.framework.domain.Role;
import edu.mum.framework.service.UserService;
import edu.mum.framework.service.factory.ServiceFactory;

public class UserController<T> {
	
	UserDirector<T> userDirector = new UserDirector<T>(new UserCreator());
	Class<T> classType;
	
	/*private LocalDate dob;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	private String address;
	private String city;
	private String state;
	private int zip;
	
	private String userName;
	private String password;
	private Role role;*/
	
	
	public UserController(Class<T> classType) {
		this.classType = classType;
	}
		
	
	
	public boolean buillUser(Class<AUser> currentClass, List<Field> filteredParams, 
			List<String> listOfArguments){
	
		UserDirector<T> userDirector = new UserDirector(new UserCreator<T>());
		
			try {
				AUser obj = currentClass.newInstance();
				
				userDirector.userInfo(dob, firstName, lastName, phoneNumber);
				userDirector.userAddress(address, city, state, zip);
				userDirector.userCredential(userName, password, role);
				userDirector.userStatus(userStatus);
				
				//filteredParams
				
				for(int j = 0; j < listOfArguments.size(); j++) {
					for(int i = 0; i < currentClass.getMethods().length; i++){
						if(currentClass.getMethods()[i].getName().toLowerCase().contains(filteredParams.get(j).getName().toLowerCase())
								&& currentClass.getMethods()[i].getParameterCount() == 1
								&& currentClass.getMethods()[i].getParameters()[0].getType().equals(filteredParams.get(j).getType())) {
							currentClass.getMethods()[i].invoke(obj, listOfArguments.get(j));
						}
						
					}					
				}			
				@SuppressWarnings("unchecked")
				ProductService<AProduct> productService = ServiceFactory.createProductService(AProduct.class, AProduct.class.getSimpleName());
				productService.saveProduct(obj);
				
				
			} catch (SecurityException e) {		
				e.printStackTrace();
				return false;
			} catch (InstantiationException e) {		
				e.printStackTrace();
				return false;
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				return false;
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				return false;
			} catch (InvocationTargetException e) {
				e.printStackTrace();
				return false;
			} 
			return true;			
		}
		
	
	/*public UserDirector<T> getUserDirector(){
		return userDirector;
	}*/
	
	@SuppressWarnings("unchecked")
	public UserService<T> getUserServices(){
		return ServiceFactory.createUserService(classType.getClass(), 
				classType.getClass().getSimpleName());
	}
}