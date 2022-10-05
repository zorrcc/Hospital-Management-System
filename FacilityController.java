import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FacilityController implements Initializable{
	//binding to JavaFX components in FXML file 
	@FXML
	private TableView<Facility> tbFac;
	
	@FXML
	public TableColumn<Staff,String> Facility;
	
	public FacilityController(){
		
	}
	//go to start page
	@FXML
	public void onBtnStartandBackClick(ActionEvent mouseEvent) {
		Node n = (Node) mouseEvent.getSource();
		Stage stage = (Stage) n.getScene().getWindow();
		stage.close();
		loadStage("start.fxml");
		
	}
	//implement loadStage method
	private void loadStage(String fxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
          //create Scene
            Stage stage = new Stage();
          //set Scene to Stage
            stage.setScene(new Scene(root,800,600));
          //only input events from child hierachy
            stage.initModality(Modality.APPLICATION_MODAL);
          //Display Stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();//print stack trace when error occur
        }
    }
	//to add Facility
	@FXML
	public void onBtnFacilityAddClick(ActionEvent mouseEvent) {
		try {
            Parent root = FXMLLoader.load(getClass().getResource("AddFacility.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root,600,450));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();//print stack trace when error occur
        }
	}
	//initialize controller
	@Override
    public void initialize(URL location, ResourceBundle resources) {

        Facility.setCellValueFactory(new PropertyValueFactory<>("Facility"));
        tbFac.setItems(facilities);
    }
	//create new observable array list
	public static ObservableList<Facility> facilities = FXCollections.observableArrayList(
			new Facility("Ambulance"),
			new Facility("Admit Facility"),
			new Facility("Canteen"),
			new Facility("Emergency")
			
	);
}
