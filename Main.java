import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
	
	//launch the program
	public static void main(String[] args) {
		launch(args);
	}

	//open the HMS.fxml scene and show the program
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
		Parent root = FXMLLoader.load(getClass().getResource("HMS.fxml"));
		Scene scene = new Scene(root,800,600);
		primaryStage.setTitle("Hospital Management System");
		primaryStage.setScene(scene);
		primaryStage.show();
		} catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	
	
	
}
