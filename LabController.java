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

public class LabController implements Initializable{
	@FXML
	private TableView<Lab> tbLab;
	
	@FXML
	public TableColumn<Lab,String> lab;
	
	@FXML
	public TableColumn<Lab,Integer> cost;
	//default constructor for LabController class
	public LabController() {
		
	}
	
	@FXML
	//button to back to the main page
	public void onBtnStartandBackClick(ActionEvent mouseEvent) {
		Node n = (Node) mouseEvent.getSource();
		Stage stage = (Stage) n.getScene().getWindow();
		stage.close();
		loadStage("start.fxml");
		
	}
	//open the scene that be write
	private void loadStage(String fxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene(root,800,600));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	@FXML
	//button to trigger the addLab.fxml
	public void onBtnLabAddClick(ActionEvent mouseEvent) {
		try {
            Parent root = FXMLLoader.load(getClass().getResource("AddLab.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root,600,450));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	@Override
	//link the variable to the table
    public void initialize(URL location, ResourceBundle resources) {

        lab.setCellValueFactory(new PropertyValueFactory<>("Lab"));
        cost.setCellValueFactory(new PropertyValueFactory<>("Cost"));
        
        tbLab.setItems(labs);
    }
	//set the Lab info into the array list of Lab
	public static ObservableList<Lab> labs = FXCollections.observableArrayList(
			new Lab("Lab Science D1",12000),
			new Lab("Lab Computer N1",22500),
			new Lab("Lab Computer N2",12500),
			new Lab("Lab Chemistry N1",23000),
			new Lab("Lab Chemistry N2",22500)
	);
	
}
