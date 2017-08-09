package edu.mum.ui;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

//import library.businesslogic.PersonDao;

public class LoginController implements InitLoader {

	@FXML
	private Button btn_signin;

	@FXML
	private PasswordField input_password;

	@FXML
	private TextField input_idnumber;
	
	@FXML
	private Label apptitle;

	@FXML
	private Label msg_error;
	
	@FXML
	private ImageView bg_image;
	

	@FXML
	void input_idnumber(ActionEvent event) {

	}

	@FXML
	void input_password(ActionEvent event) {

	}

	@FXML
	void btn_signin(ActionEvent event) {
//
//		try {
//			PersonDao personDao = new PersonDao();
//			String roleType = personDao.login(Integer.parseInt(input_idnumber.getText()), input_password.getText());
//			
//			if (roleType.equals("Admin")) {
//				Navigation.setRole("Admin");
//				loadTopbarVars(personDao);
//				Navigation.goNewMember(this);
//				
//			} else if (roleType.equals("Librarian")) {
//				Navigation.setRole("Librarian");
//				loadTopbarVars(personDao);
				Navigation.getInstance().goHome(this);
//			} else if (roleType.equals("AdminLibrarian")) {
//				Navigation.setRole("AdminLibrarian");
//				loadTopbarVars(personDao);
//				Navigation.goHome(this);
//			} else {
//				msg_error.setText(roleType);
//			}
//		} catch (NumberFormatException e) {
//			msg_error.setText("There is an error on your input");
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
	}
	
//	void loadTopbarVars(PersonDao personDao){
////		String fullname = personDao.getPerson(Integer.parseInt(input_idnumber.getText())).getFirstName() + " "
////				+ personDao.getPerson(Integer.parseInt(input_idnumber.getText())).getLastName();
////		Navigation.setFullname(fullname);
////		clean_form();
//	}
	
	void clean_form() {
		input_password.setText("");
		input_idnumber.setText("");
		msg_error.setText("");
	}
	
	@FXML
    public void initialize() {
		loadInitialData();
    }

	@Override
	public void loadInitialData() {
		this.apptitle.setText(Loader.getInstance().getAppname());
		File file = new File(Loader.getInstance().getLoginBGImage());
        Image image = new Image(file.toURI().toString());
        this.bg_image.setImage(image);
		
	}

}
