package controller;

import javafx.fxml.FXML;

public class TopMenuButtonsController {

 	private MainController mainController;
	
	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}

	@FXML
	public void openArticles() {
		mainController.setCenter("/fxml/OpenOpinions.fxml");

	}
	
	@FXML
	public void openAutorsList() {
		mainController.setCenter("/fxml/OpenFirstAutorsList.fxml");

	}
	
	@FXML
	public void addArticle() {
		 
		mainController.setCenter("/fxml/AddArticle.fxml");
	}
}
