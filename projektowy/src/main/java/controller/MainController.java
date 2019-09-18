package controller;

import java.util.Optional;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import utils.DialogsUtils;
import utils.FxmlUtils;

public class MainController {

	@FXML
	private TopMenuButtonsController topMenuButtonsController;
	
	@FXML
	private BorderPane borderPane;
	
	@FXML
	private void initialize() {
		topMenuButtonsController.setMainController(this);
	}
	
	public void setCenter(String fxmlPath) {
		/*FXMLLoader loader=new FXMLLoader();		//Do czytania plików fxml
		loader.setLocation(this.getClass().getResource(fxmlPath));//("/fxml/BorderPaneMain.fxml")); 
		Parent parent=null;
		try {
			parent = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		borderPane.setCenter(FxmlUtils.fxmlLoader(fxmlPath));
	}
	
	public void closeApplication() {
		Optional <ButtonType> results= DialogsUtils.confirmationDialog();
		if(results.get()==ButtonType.OK) {
		Platform.exit();
		System.exit(0);
		}
	}
	
	public void setCaspian() {
		Application.setUserAgentStylesheet("CASPIAN");
	}
	
	public void setModena() {
		Application.setUserAgentStylesheet("MODENA");
	}
	
	public void about() {
		DialogsUtils.dialogAboutApplication();
	}
}
