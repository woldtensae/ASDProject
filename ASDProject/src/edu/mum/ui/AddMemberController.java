package edu.mum.ui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

//import library.businesslogic.Address;
//import library.businesslogic.Member;
//import library.businesslogic.Person;
//import library.businesslogic.PersonDao;

public class AddMemberController implements Initializable {
	
	@FXML
    private AnchorPane header;
	
    @FXML
    private TextField input_phonenumber;

    @FXML
    private TextField input_address;

    @FXML
    private Label msg_error;

    @FXML
    private TextField input_idnumber;

    @FXML
    private TextField input_lastname;

    @FXML
    private TextField input_firstname;

    @FXML
    private Label label_loggeduser;

    @FXML
    private TextField input_state;

    @FXML
    private TextField input_zipcode;

    @FXML
    private Button btn_createmember;

    @FXML
    private TextField input_city;

    
  
    
    @FXML
    void btn_createmember(ActionEvent event) {
//    	try {
//    	PersonDao personDao = new PersonDao();
//    	Address address = new Address(input_address.getText(),
//    			input_city.getText(), input_state.getText(), Integer.parseInt(input_zipcode.getText()));
//    	
//    	Person person = new Member(Integer.parseInt(input_idnumber.getText()), input_firstname.getText(), 
//    			input_lastname.getText(), input_phonenumber.getText(), address);
//    	
//    	personDao.setPerson(person);
//    	String message = personDao.addPerson();
//    	this.clearFields();
//    	msg_error.setText(message);
//    	} catch (NumberFormatException e) {
//    		msg_error.setText("Please check the format. Id Number, phone and zipcode receive only numbers.");
//    	}
    }
    
    void clearFields(){
    	input_address.setText("");
    	input_idnumber.setText("");
    	input_lastname.setText("");
    	input_firstname.setText("");
    	input_state.setText("");
    	input_city.setText("");
    	input_zipcode.setText("");
    	input_phonenumber.setText("");
    	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		HeaderController h = new HeaderController();
		
		
	}



}

