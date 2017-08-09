package edu.mum.framework.domain;

import java.io.Serializable;

public class Credential implements Serializable{
	   
	
/**
* 
*/
		private static final long serialVersionUID = 1L;
		private String userName;
		private String password;
		private Role userRole;
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public Credential(String userName, String password) {
			super();
			this.userName = userName;
			this.password = password;
		}
}
