package articles;

import dbutils.DbManager;
import javafx.application.Application;
import javafx.stage.Stage;
import utils.FxmlUtils;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		/*FXMLLoader loader=new FXMLLoader();		//Do czytania plików fxml
		loader.setLocation(this.getClass().getResource("/fxml/BorderPaneMain.fxml")); 
		BorderPane borderPane=loader.load();*/
		
		Pane borderPane=FxmlUtils.fxmlLoader("/fxml/BorderPaneMain.fxml");
		Scene scene=new Scene(borderPane);
		
		
		//arg0.setWidth(1000);
		//arg0.setHeight(1000);
		//arg0.setResizable(false);
		
		arg0.setScene(scene); 	
		arg0.setTitle("Baza artyku³ów");
		arg0.show();
		
		DbManager.initDatabase();
	}

}
