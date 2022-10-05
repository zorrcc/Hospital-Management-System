import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class AddDoctor implements Initializable{
	@FXML
	 public TextField t1; //create textfield t1,t2,t3,t4,t5,t6 for user to input
	 @FXML
	 public TextField t2;
	 @FXML
	 public TextField t3;
	 @FXML
	 public TextField t4;
	 @FXML
	 public TextField t5;
	 @FXML
	 public TextField t6;
	 
	 @FXML
	//btnADD is to trigger action of add Doctor info
		public void btnADD(ActionEvent e) {
			try{
			      Integer.valueOf(t6.getText());
			    }catch(NumberFormatException exception){
			      Alert alert = new Alert(AlertType.ERROR); //alert user when there are wrong in the data type of user input in room number
			      alert.setContentText("Room must be an Integer");
			      alert.showAndWait();
			      return;
			    }
			//key in the user input into the Doctor class by set the mutator of doctor class.
			Doctor doctor= new Doctor();
			doctor.setId(t1.getText());
			doctor.setName(t2.getText());
			doctor.setSpecialist(t3.getText());
			doctor.setWorkTime(t4.getText());
			doctor.setQualification(t5.getText());
			doctor.setRoom(Integer.parseInt(t6.getText()));
			//clear the textfield to become empty for next user input
			if(table != null){
			      table.getItems().add(doctor);
			      if(stage != null){
			        t1.clear();
			        t2.clear();
			        t3.clear();
			        t4.clear();
			        t5.clear();
			        t6.clear();
			        stage.close();
			      }
			    }
			
				DoctorController.doctors.add(doctor);
				Alert complete = new Alert(AlertType.INFORMATION);
				complete.setContentText("Complete to add the Doctor");
				complete.showAndWait();
				Node n = (Node) e.getSource();
				Stage stage = (Stage) n.getScene().getWindow();
				stage.close();
			
			
	 }

	 
	//To let the class can be used only
	 @Override
	 public void initialize(URL url, ResourceBundle rb){
		 
	  }
	//set stage
	 private Stage stage;
	  public void setStage(Stage stage){
	    this.stage = stage;
	  }
	//set doctor table
	  private TableView<Doctor> table;
	  public void setTable(TableView<Doctor> table){
	    this.table = table;
	  }
}
