package edu.mum.framework.controller;

public class Main {
	public static void main(String[] str){
		LoginController lc = new LoginController();
		System.out.println(lc.authenticateUser("aman", "estifanos"));
	}
}
