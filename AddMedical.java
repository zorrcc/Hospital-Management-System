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

public class AddMedical implements Initializable{
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
		public void btnADD(ActionEvent e) {
		//check if cost is in integer format
		 try{
			 Integer.valueOf(t4.getText());
		    }catch(NumberFormatException exception){
		      Alert alert = new Alert(AlertType.ERROR);
		      alert.setContentText("Cost must be an Integer");
		      alert.showAndWait();
		      return;
		    }
		//check if count is in integer format
			try{
			      Integer.valueOf(t5.getText());
			    }catch(NumberFormatException exception){
			      Alert alert = new Alert(AlertType.ERROR);
			      alert.setContentText("Count must be an Integer");
			      alert.showAndWait();
			      return;
			    }
			//create Medical and initialize attributes
			Medical medical= new Medical();
			medical.setName(t1.getText());
			medical.setManufacturer(t2.getText());
			medical.setExpiryDate(t3.getText());
			medical.setCost(Integer.parseInt(t4.getText()));
			medical.setCount(Integer.parseInt(t5.getText()));
			
			if(table != null){
			      table.getItems().add(medical);//add medical if table is not null
			      if(stage != null){
			        t1.clear();
			        t2.clear();
			        t3.clear();
			        t4.clear();
			        t5.clear();
			      //remove all elements when stage is not null
			        //close stage
			        stage.close();
			      }
			    }
			
				MedicalController.medicals.add(medical);
				//inform user after completing action
				Alert complete = new Alert(AlertType.INFORMATION);
				complete.setContentText("Complete to add the Medical");
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

	  private TableView<Medical> table;
	  public void setTable(TableView<Medical> table){
	    this.table = table;
	  }
}
