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

public class AddPatient implements Initializable{
	@FXML
	 public TextField t1;
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
		public void btnADD(ActionEvent e) {
		//check if age is in integer format
		 try{
			      Integer.valueOf(t6.getText());
			    }catch(NumberFormatException exception){
			      Alert alert = new Alert(AlertType.ERROR);
			      alert.setContentText("Age must be an Integer");
			      alert.showAndWait();
			      return;
			    }
		//create Patient and initialize attributes
			Patient patient= new Patient();
			patient.setId(t1.getText());
			patient.setName(t2.getText());
			patient.setDisease(t3.getText());
			patient.setSex(t4.getText());
			patient.setAdmitStatus(t5.getText());
			patient.setAge(Integer.parseInt(t6.getText()));
			
			if(table != null){
			      table.getItems().add(patient);//add patient if table is not null
			      if(stage != null){
			        t1.clear();
			        t2.clear();
			        t3.clear();
			        t4.clear();
			        t5.clear();
			        t6.clear();
			      //remove all elements when stage is not null
			        //close stage
			        stage.close();
			      }
			    }
			
				PatientController.patients.add(patient);
				//inform user after completing action
				Alert complete = new Alert(AlertType.INFORMATION);
				complete.setContentText("Complete to add the Patient");
				complete.showAndWait();
				Node n = (Node) e.getSource();
				Stage stage = (Stage) n.getScene().getWindow();
				stage.close();
			
			
	 }

	 
	
	 @Override
	 public void initialize(URL url, ResourceBundle rb){
		 
	  }
	 
	 private Stage stage;
	  public void setStage(Stage stage){
	    this.stage = stage;
	  }

	  private TableView<Patient> table;
	  public void setTable(TableView<Patient> table){
	    this.table = table;
	  }
}
