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

public class StaffController implements Initializable{

	@FXML
	private TableView<Staff> tbData;
	
	@FXML
	public TableColumn<Staff,String> id;
	
	@FXML
	public TableColumn<Staff,String> name;
	
	@FXML
	public TableColumn<Staff,String> designation;
	
	@FXML
	public TableColumn<Staff,String> sex;
	
	@FXML
	public TableColumn<Staff,Integer> salary;
	
	//default constructor for StaffController class
	public StaffController() {
		
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
	//button to trigger the addStaff.fxml
	public void onBtnStaffAddClick(ActionEvent mouseEvent) {
		try {
            Parent root = FXMLLoader.load(getClass().getResource("AddStaff.fxml"));
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

        id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        designation.setCellValueFactory(new PropertyValueFactory<>("Designation"));
        sex.setCellValueFactory(new PropertyValueFactory<>("Sex"));
        salary.setCellValueFactory(new PropertyValueFactory<>("Salary"));
        tbData.setItems(Staffs);
    }
	//set the staff info into the array list of Staff.
	public static ObservableList<Staff> Staffs = FXCollections.observableArrayList(
			new Staff("2003429","Chai Mui Han","Admin","Male",2000),
			new Staff("2001604","CHeah Jynn","Admin","Male",2500)
			
	);
	

	  
	

}
