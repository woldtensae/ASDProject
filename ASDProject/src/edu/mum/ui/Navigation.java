package edu.mum.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class Navigation implements InitLoader {
	
	private static Navigation instance = new Navigation();
	
	private Navigation(){
		
	}
	
	private Stage primaryStage;
	private Stage navigationStage;
	private int role;
	private String roleName;
	private String fullName;

	
	public static Navigation getInstance(){
		return instance;
	}
	
	public void setPrimaryStage(Stage st){
		instance.primaryStage = st;
	}
	
	protected void setRole(String s){
		
		if(s.equals("Admin")){
			instance.role = 0;
		} else if(s.equals("AdminLibrarian")) {
			instance.role = 1;
		} else {
			instance.role = 2;
		}
		setRolename(s);
	}	
	
	protected void setFullname(String fullName1){
		this.fullName = fullName1;
	}
	
	protected void setRolename(String roleName1){
		this.roleName = roleName1;
	}
	
	
	protected int getRole(){
		return instance.role;
	}
	
//	protected void goNewMember(Object o){
//		try{
//            FXMLLoader fxmlLoader = new FXMLLoader(o.getClass().getResource("/library/ui/AddMember.fxml"));
//            Parent root1 = (Parent) fxmlLoader.load();
//            checkIfOpenedLogin();
//            if(navigationStage == null) createStage();            
//            navigationStage.setScene(new Scene(root1));  
//            navigationStage.show();
//          } catch(Exception e) {
//        	  e.printStackTrace();
//        	  
//          }
//	}
//	
//	protected void goOverdue(Object o){
//		try{
//            FXMLLoader fxmlLoader = new FXMLLoader(o.getClass().getResource("/library/ui/Overdue.fxml"));
//            Parent root1 = (Parent) fxmlLoader.load();
//            if(navigationStage == null) createStage();            
//            navigationStage.setScene(new Scene(root1));  
//            navigationStage.show();
//          } catch(Exception e) {
//        	  e.printStackTrace();
//        	  
//          }
//	}
//	
//	protected void goAddcopyBook(Object o){
//		try{
//            FXMLLoader fxmlLoader = new FXMLLoader(o.getClass().getResource("/library/ui/AddBookCopy.fxml"));
//            
//            Parent root1 = (Parent) fxmlLoader.load();
//            if(navigationStage == null) createStage();            
//            navigationStage.setScene(new Scene(root1));
//            navigationStage.show();
//            
//          } catch(Exception e) {
//        	  e.printStackTrace();
//        	  
//          }
//	}
//	
//	protected void goNewBook(Object o){
//		try{
//            FXMLLoader fxmlLoader = new FXMLLoader(o.getClass().getResource("/library/ui/AddBook.fxml"));
//            
//            Parent root1 = (Parent) fxmlLoader.load();
//            if(navigationStage == null) createStage();            
//            navigationStage.setScene(new Scene(root1));
//            navigationStage.show();
//            
//          } catch(Exception e) {
//        	  e.printStackTrace();
//        	  
//          }
//	}
//	
//	protected void goCheckMemberRecord(Object o){
//		try{
//            FXMLLoader fxmlLoader = new FXMLLoader(o.getClass().getResource("/library/ui/Member.fxml"));
//            
//            Parent root1 = (Parent) fxmlLoader.load();
//            if(navigationStage == null) createStage();            
//            navigationStage.setScene(new Scene(root1));
//            navigationStage.show();
//            
//          } catch(Exception e) {
//        	  e.printStackTrace();
//        	  
//          }
//	}
	

	protected void createStage(){
		this.primaryStage.hide();
		this.navigationStage = new Stage();
		this.navigationStage.setTitle(Loader.getInstance().getAppname());
	}
	
	protected void checkIfOpenedLogin(){
		if(instance.primaryStage.isShowing()) instance.primaryStage.hide();
	}
	
	protected void goHome(Object o){
		try{
            FXMLLoader fxmlLoader = new FXMLLoader(o.getClass().getResource("/edu/mum/framework/ui/AddMember.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            checkIfOpenedLogin();
            if(navigationStage == null) createStage();
            
            navigationStage.setScene(new Scene(root1));  
            navigationStage.setResizable(false);
            navigationStage.show();
          } catch(Exception e) {
        	  System.err.println(e);
        	  e.printStackTrace();
          }
	}
	
	protected void exitProgram(Object o){
		navigationStage.close();
		primaryStage.show();
	}

	@Override
	public void loadInitialData() {
		this.primaryStage.setTitle(Loader.getInstance().getAppname());
	}
	
	
	
	

}
