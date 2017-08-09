package edu.mum.ui;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HeaderController implements InitLoader {
	
    @FXML
    private Label label_loggeduser;

    @FXML
    private MenuItem menu_addcopy_book;

    @FXML
    private Menu menu_home;

    @FXML
    private MenuItem menu_listoverdues;

    @FXML
    private MenuItem menu_exit;

    @FXML
    private MenuItem menu_add_newbook;

    @FXML
    private MenuItem menu_newmember;

    @FXML
    private MenuItem menu_home1;

    @FXML
    private MenuItem menu_listmembers;

    @FXML
    private MenuItem menu_home11;
    
    @FXML
    private ImageView bg_h_image;

	@Override
	public void loadInitialData() {
		File file = new File(Loader.getInstance().getLoginBGHeaderImage());
        Image image = new Image(file.toURI().toString());
        this.bg_h_image.setImage(image);
		
	}
	
	@FXML
    public void initialize() {
		loadInitialData();
    }

}
