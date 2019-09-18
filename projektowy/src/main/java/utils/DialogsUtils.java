package utils;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;

public class DialogsUtils {

	public static void dialogAboutApplication() {
		Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
		informationAlert.setTitle("O aplikacji");
		informationAlert.setHeaderText("Aplikacja na Projekt z Podstaw Programowania Aplikacji");
		informationAlert.setContentText("To dopiero wersja wstêpna.");
		informationAlert.showAndWait();
	}
	
	public static Optional<ButtonType> confirmationDialog() {
		Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
		confirmationAlert.setTitle("Uwaga");
		confirmationAlert.setHeaderText("Czy na pewno chcesz zamkn¹æ aplikacjê?");
		Optional<ButtonType> result=confirmationAlert.showAndWait();
		return result;
	}
	
	public static void errorDialog(String error) {
		Alert errorAlert=new Alert(Alert.AlertType.ERROR);
		errorAlert.setTitle("Wykryto b³¹d");
		errorAlert.setHeaderText("Proszê poprawiæ b³¹d");
		
		
		TextArea textArea=new TextArea(error);
		errorAlert.getDialogPane().setContent(textArea);
		
		errorAlert.showAndWait();

	}
}
 