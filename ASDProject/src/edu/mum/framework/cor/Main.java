package edu.mum.framework.cor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.mum.framework.domain.User;
import edu.mum.framework.domain.UserStatus;
import edu.mum.framework.service.UserService;
import edu.mum.framework.service.impl.UserServiceImpl;

public class Main {
	private ChainBuilder chain=new ChainBuilder();
	
	public static void main(String[] args) {
	  List<User> userList=new ArrayList<User>();
	  
	  userList.get(0).setAge(3);  
	  userList.get(0).setFirstName("");
	  userList.get(1).setAge(19);  
	  userList.get(1).setFirstName("BBBBB");
	  userList.get(1).setLastName("BCCCC");
	  userList.get(1).setUserStatus(UserStatus.ACTIVE);
	  Main main=new Main();
	  main.sendRequest(userList);
}
	public  void sendRequest(List<User> list){
	   chain.getHandler().handleRequest(list);
		
	 }
}
