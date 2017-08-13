package edu.mum.app.controller;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import edu.mum.app.domain.Book;
import edu.mum.framework.domain.AProduct;
import edu.mum.framework.domain.Unit;

public class Main {

	public static void main(String[] args) {
		
		//using the login controller for user login
		/*LoginController<Member> lc = new LoginController<Member>(Member.class);
		lc.authenticateUser("meron", "tolosa");
		System.out.println(lc.authenticateUser("meron", "tolosa"));*/
		
		
		
		//using the frame work to create a user and save member 
		/*MemberController mc = new MemberController();
				
		UserDirector<AUser> ud = mc.getUserDirector();
		ud.userInfo(LocalDate.of(1981, 04, 12), "Ameha", "Amsalu", "12-34-35");
		ud.userCredential("mmmm", "mmmm", Role.ADMIN);
		ud.userAddress("1843", "AddisAbaba", "Bole", 1945);		
		AUser member = ud.createFullUser();
		mc.getMemberService().saveUser(member);
		System.out.println(member);
		System.out.println(mc.getMemberService().findAllUser());*/
		
		//using the framework to create a new product dynamically
		/*Field[] fildes = Book.class.getFields(); 
		BookController bc = new BookController(Book.class);
		List<String> list = null;
		boolean saved = bc.buillProduct(AProduct.class, Arrays.asList(fildes), list, "", "", 5.5, Unit.DAILY);
		System.out.println(saved);*/
		
		
	}
}
