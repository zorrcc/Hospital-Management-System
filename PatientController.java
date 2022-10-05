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

public class PatientController implements Initializable{
	//binding to JavaFX components in FXML file 
	@FXML
	private TableView<Patient> tbPatient;
	
	@FXML
	public TableColumn<Patient,String> id;
	
	@FXML
	public TableColumn<Patient,String> name;
	
	@FXML
	public TableColumn<Patient,String> disease;
	
	@FXML
	public TableColumn<Patient,String> sex;
	
	@FXML
	public TableColumn<Patient,String> admitStatus;
	
	@FXML
	public TableColumn<Patient,Integer> age;
	
	public PatientController() {
		
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
	            e.printStackTrace(); //print stack trace when error occur
	        }
	    }
		//to add Patient	
	@FXML
	public void onBtnPatientAddClick(ActionEvent mouseEvent) {
		try {
            Parent root = FXMLLoader.load(getClass().getResource("AddPatient.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root,600,450));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	//initialize controller
	@Override
	public void initialize(URL location, ResourceBundle resources) {

        id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        disease.setCellValueFactory(new PropertyValueFactory<>("Disease"));
        sex.setCellValueFactory(new PropertyValueFactory<>("Sex"));
        admitStatus.setCellValueFactory(new PropertyValueFactory<>("admitStatus"));
        age.setCellValueFactory(new PropertyValueFactory<>("Age"));
        tbPatient.setItems(patients);
    }
	//create new observable array list
	public static ObservableList<Patient> patients = FXCollections.observableArrayList(
			new Patient("2003429","Chai Mui Han","Headage","Male","y",20),
			new Patient("2001604","CHeah Jynn","Cough","Male","y",25),
			new Patient("2003124","Tan Wei Xuan","Cold","Male","y",30),
			new Patient("15","Pankaj","Cancer","Male","y",45),
			new Patient("13","Sumit","Maleriya","Female","y",30)
			
			
	);
	
}
