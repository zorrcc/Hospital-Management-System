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

public class DoctorController implements Initializable{
	@FXML
	private TableView<Doctor> tbDoctor;
	
	@FXML
	public TableColumn<Doctor,String> id;
	
	@FXML
	public TableColumn<Doctor,String> name;
	
	@FXML
	public TableColumn<Doctor,String> specialist;
	
	@FXML
	public TableColumn<Doctor,String> workTime;
	
	@FXML
	public TableColumn<Doctor,String> qualification;
	
	@FXML
	public TableColumn<Doctor,Integer> room;
	//default constructor for DoctorController class
	public DoctorController() {
		
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
	//button to trigger the addDoctor.fxml
	public void onBtnDoctorAddClick(ActionEvent mouseEvent) {
		try {
            Parent root = FXMLLoader.load(getClass().getResource("AddDoctor.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root,600,450));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	//link the variable to the table
	@Override
	public void initialize(URL location, ResourceBundle resources) {

        id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        specialist.setCellValueFactory(new PropertyValueFactory<>("Specialist"));
        workTime.setCellValueFactory(new PropertyValueFactory<>("WorkTime"));
        qualification.setCellValueFactory(new PropertyValueFactory<>("Qualification"));
        room.setCellValueFactory(new PropertyValueFactory<>("Room"));
        tbDoctor.setItems(doctors);
    }
	//set the Doctor info into the array list of Doctor.
	public static ObservableList<Doctor> doctors = FXCollections.observableArrayList(
			new Doctor("21","Chai Mui Han","ENT","8-10AM","MBBS,MD",20),
			new Doctor("25","CHeah Jynn","Physician","9-11AM","MBBS,MD",25),
			new Doctor("32","Tan Wei Xuan","Surgeon","8-2PM","BDM",8),
			new Doctor("33","Dr.Rekha","Artho","10-4PM","MBBS,MS",1),
			new Doctor("55","Dr.Pramod","ENT","5-11AM","BDM",9)
			
	);
	
	
}
