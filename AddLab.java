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

public class AddLab implements Initializable{
	//create textfield t1 and t2 for user to input
	@FXML
	 public TextField t1;
	 @FXML
	 public TextField t2;
	 
	 @FXML
	//btnADD is to trigger action of add Lab info
		public void btnADD(ActionEvent e) {
			try{
			      Integer.valueOf(t2.getText());
			    }catch(NumberFormatException exception){
			      Alert alert = new Alert(AlertType.ERROR);//alert user when there are wrong in the data type of user input in cost
			      alert.setContentText("Cost must be an Integer");
			      alert.showAndWait();
			      return;
			    }
			//key in the user input into the Lab class by set the mutator of Lab class.
			Lab lab= new Lab();
			lab.setLab(t1.getText());
			lab.setCost(Integer.parseInt(t2.getText()));
			//clear the textfield to become empty for next user input
			if(table != null){
			      table.getItems().add(lab);
			      if(stage != null){
			        t1.clear();
			        t2.clear();
			        stage.close();
			      }
			    }
			
				LabController.labs.add(lab);
				Alert complete = new Alert(AlertType.INFORMATION);
				complete.setContentText("Complete to add the Lab");
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
	//set Lab table
	  private TableView<Lab> table;
	  public void setTable(TableView<Lab> table){
	    this.table = table;
	  }
}
