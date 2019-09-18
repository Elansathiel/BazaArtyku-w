package utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class FxmlUtils {

	public static Pane fxmlLoader(String fxmlPath) {
		FXMLLoader loader=new FXMLLoader();		//Do czytania plików fxml
		loader.setLocation(FxmlUtils.class.getClass().getResource(fxmlPath)); 
		 try {
			return loader.load();
		} catch (Exception e) {
			DialogsUtils.errorDialog(e.getMessage());
		}
		 return null;
	}
}
