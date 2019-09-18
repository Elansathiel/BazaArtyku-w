package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import models.ArticleFx;
import models.ArticleModel;
import utils.ApplicationException;
import utils.DialogsUtils;

public class ArticleController {

	@FXML
	private TextField nameTextField;
	
	@FXML
	private TextField surnameTextField;
	
	@FXML
	private TextField titleTextField;
	
	@FXML
	private Button addButton;
	
	@FXML
	private TableView<ArticleFx> articleTableView;
	
	@FXML
	private TableColumn<ArticleFx, String> nameColumn;
	
	@FXML
	private TableColumn<ArticleFx, String> surnameColumn;
	
	@FXML
	private TableColumn<ArticleFx, String> titleColumn;
	
	private ArticleModel articleModel;
	
	public void initialize() {
		this.articleModel=new ArticleModel();
		try {
			this.articleModel.init();
		} catch (ApplicationException e) {
			DialogsUtils.errorDialog(e.getMessage());
		}
		this.articleModel.articleFxObjectProperty().get().nameProperty().bind(this.nameTextField.textProperty());
		this.articleModel.articleFxObjectProperty().get().surnameProperty().bind(this.surnameTextField.textProperty());;
		this.articleModel.articleFxObjectProperty().get().titleProperty().bind(this.titleTextField.textProperty());;
		this.addButton.disableProperty().bind(this.nameTextField.textProperty().isEmpty().or(this.surnameTextField.textProperty().isEmpty().or(this.titleTextField.textProperty().isEmpty())));
		
		this.articleTableView.setItems(this.articleModel.getArticleFxObservableList());
		this.nameColumn.setCellValueFactory(cellData->cellData.getValue().nameProperty());
		this.surnameColumn.setCellValueFactory(cellData->cellData.getValue().surnameProperty());
		this.titleColumn.setCellValueFactory(cellData->cellData.getValue().titleProperty());

		
	}
	public void addArticleOnAction() {
	
		try {
			this.articleModel.saveArticleInDataBase();
		} catch (ApplicationException e) {
			DialogsUtils.errorDialog(e.getMessage());
		}
		this.nameTextField.clear();
		this.surnameTextField.clear();
		this.titleTextField.clear();
		
	}
	
}
