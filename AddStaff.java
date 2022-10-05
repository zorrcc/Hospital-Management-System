import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddStaff implements Initializable{
	//create textfield t1,t2,t3,t4,t5 for user to input
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
	//btnADD is to trigger action of add Staff info
		public void btnADD(ActionEvent e) {
			try{
			      Integer.valueOf(t5.getText());
			    }catch(NumberFormatException exception){
			      Alert alert = new Alert(AlertType.ERROR);//alert user when there are wrong in the data type of user input in salary
			      alert.setContentText("Salary must be an Integer");
			      alert.showAndWait();
			      return;
			    }
			Staff staff= new Staff();
			staff.setId(t1.getText());
			staff.setName(t2.getText());
			staff.setDesignation(t3.getText());
			staff.setSex(t4.getText());
			staff.setSalary(Integer.parseInt(t5.getText()));
			//clear the textfield to become empty for next user input
			if(table != null){
			      table.getItems().add(staff);
			      if(stage != null){
			        t1.clear();
			        t2.clear();
			        t3.clear();
			        t4.clear();
			        t5.clear();
			        stage.close();
			      }
			    }
			
				StaffController.Staffs.add(staff);
				Alert complete = new Alert(AlertType.INFORMATION);
				complete.setContentText("Complete to add the Staff");
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
	  private TableView<Staff> table;
	  public void setTable(TableView<Staff> table){
	    this.table = table;
	  }
}
