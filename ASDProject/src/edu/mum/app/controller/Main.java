package edu.mum.app.controller;

import java.time.LocalDate;

import edu.mum.app.domain.Member;
import edu.mum.framework.controller.LoginController;
import edu.mum.framework.controller.UserDirector;
import edu.mum.framework.domain.Role;
import edu.mum.framework.domain.concrete.User;

public class Main {

	public static void main(String[] args) {
		LoginController<Member> lc = new LoginController<Member>(Member.class);
		lc.authenticateUser("meron", "tolosa");
		
		MemberController mc = new MemberController();
		UserDirector<User> ud = mc.getUserDirector();
		ud.userInfo(LocalDate.of(1981, 04, 12), "name", "lastName", "12-34-35");
		ud.userCredential("meron", "tolosa", Role.ADMIN);
		ud.userAddress("1843", "AddisAbaba", "Bole", 1945);		
		User user = ud.createFullUser();
		
		
		mc.getUserServices().saveUser(user);
		
		lc.authenticateUser("meron", "tolosa");
	}

}
