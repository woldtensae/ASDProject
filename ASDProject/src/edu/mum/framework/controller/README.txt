
/**************************** Login Controller ******************************/

	For developers to use the login controller 
	first create a your controller then extend the framework LoginController
		
		Class MemberLoginController extends LoginController{}
	
	in the constructor pass the class type you to work with
	
		public MemberLoginController() {
				super(Member.class);
		}
	
	Create a method that accepts two parameter as user name and password
	And call the super type authenticateUser method and pass the two parameters
	the method returns a user if the user exists and null if the user does not exist
	
		public Member authentiate(String username, String password){
			return authenticateUser(username, password);//super class method
		}
	 
 /**************************** User Controller ******************************/
 
	 
	First create a your controller then extend the framework UserController
		
		Class MemberController extends UserController{}
	
	In the constructor pass the class type you to work with
	
		public MemberController() {
			super(AUser.class);
		}
	
	Create a method that accepts a member dao class and return a member service  
	then in your main method create a MemberController, using this object create a UserDirector using this object
		MemberController mc = new MemberController(); 
	build your user object by calling the userInfo, userCredential, userAddress and finally the createFullUser method 
	a demo code snippet is as follows 
		UserDirector<AUser> ud = mc.getUserDirector();
		ud.userInfo(LocalDate.of(1981, 04, 12), "Ameha", "Amsalu", "12-34-35");
		ud.userCredential("mmmm", "mmmm", Role.ADMIN);
		ud.userAddress("1843", "AddisAbaba", "Bole", 1945);		
		AUser member = ud.createFullUser();
		mc.getMemberService().saveUser(member);
	 
 /**************************** Product Controller ******************************/
 
  /**************************** Rent Controller ******************************/
 
 
 /**************************** IDGenerator ******************************/
 	Create an auto generator instance, using that instance call the getUniqueId method
 	and pass the class you want to generate id for, ids are unique for the class but across classes they might be repeated
 	the returned object is a string value 
 	AutoGenerator autoGenerate = IDGenerator.getInstance();
		String id = autoGenerate.getUniqueId(User.class.getSimpleName());
 
 
 