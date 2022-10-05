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

public class MedicalController implements Initializable{
	//binding to JavaFX components in FXML file 
	@FXML
	private TableView<Medical> tbMedical;
	@FXML
	public TableColumn<Medical,String> name;
	@FXML
	public TableColumn<Medical,String> manufacturer;
	
	@FXML
	public TableColumn<Medical,String> expiryDate;
	
	@FXML
	public TableColumn<Medical,Integer> cost;
	@FXML
	public TableColumn<Medical,Integer> count;
	
	
	public MedicalController() {
		
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
	//to add Medical
	@FXML
	public void onBtnMedicalAddClick(ActionEvent mouseEvent) {
		try {
            Parent root = FXMLLoader.load(getClass().getResource("AddMedical.fxml"));
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

        name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        manufacturer.setCellValueFactory(new PropertyValueFactory<>("Manufacturer"));
        expiryDate.setCellValueFactory(new PropertyValueFactory<>("ExpiryDate"));
        cost.setCellValueFactory(new PropertyValueFactory<>("Cost"));
        count.setCellValueFactory(new PropertyValueFactory<>("Count"));
        tbMedical.setItems(medicals);
    }
	//create new observable array list
	public static ObservableList<Medical> medicals = FXCollections.observableArrayList(
			new Medical("Corex","Cino pvt","9-5-16",1000,200),
			new Medical("Nytra","Ace pvt","4-4-15",500,250),
			new Medical("Brufa","Reckitt","12-7-17",1500,100),
			new Medical("Pride","DDF pvt","12-4-12",1400,10),
			new Medical("AntiBiotic","Ace pvt","14-12-2022",100,70)
			
	);
	
}
