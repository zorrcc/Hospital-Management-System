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

public class AddFacility implements Initializable{
	@FXML
	 public TextField t1;
	
	@FXML
	public void btnADD(ActionEvent e) {
		//create Facility and initialize attributes
		Facility fac= new Facility();
		fac.setFacility(t1.getText());
		
		if(table != null){
		      table.getItems().add(fac);//add facility if table is not null
		      if(stage != null){
		        t1.clear();	
		      //remove all elements when stage is not null
		        //close stage
		        stage.close();
		      }
		    }
		
			FacilityController.facilities.add(fac);
			//inform user after completing action
			Alert complete = new Alert(AlertType.INFORMATION);
			complete.setContentText("Complete to add the Facility");
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

  private TableView<Facility> table;
  public void setTable(TableView<Facility> table){
    this.table = table;
  }
}
