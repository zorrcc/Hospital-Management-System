import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller {
		
	@FXML Label time;
	
	private volatile boolean stop = false;
	
	
	//when click the button, it will open the start.fxml and close the current window
	@FXML
	public void onBtnStartandBackClick(ActionEvent mouseEvent) {
		Node n = (Node) mouseEvent.getSource();
		Stage stage = (Stage) n.getScene().getWindow();
		stage.close();
		loadStage("start.fxml");
		
	}
	
	
	//when click the button, it will open the contentDoctor.fxml and close the current window
	@FXML
	public void onBtnDoctorClick(ActionEvent mouseEvent) {
		Node n = (Node) mouseEvent.getSource();
		Stage stage = (Stage) n.getScene().getWindow();
		stage.close();
		loadStage("ContentDoctor.fxml");
		
	}
	
	//when click the button, it will open the contentPatient.fxml and close the current window
	@FXML
	public void onBtnPatientClick(ActionEvent mouseEvent) {
		Node n = (Node) mouseEvent.getSource();
		Stage stage = (Stage) n.getScene().getWindow();
		stage.close();
		loadStage("ContentPatient.fxml");
	}
	
	//when click the button, it will open the contentMedical.fxml and close the current window
	@FXML
	public void onBtnMedicalClick(ActionEvent mouseEvent) {
		Node n = (Node) mouseEvent.getSource();
		Stage stage = (Stage) n.getScene().getWindow();
		stage.close();
		loadStage("ContentMedical.fxml");
	}
	
	//when click the button, it will open the contentLab.fxml and close the current window
	@FXML
	public void onBtnLabClick(ActionEvent mouseEvent) {
		Node n = (Node) mouseEvent.getSource();
		Stage stage = (Stage) n.getScene().getWindow();
		stage.close();
		loadStage("ContentLab.fxml");
	}
	
	//when click the button, it will open the contentFac.fxml and close the current window
	@FXML
	public void onBtnFacClick(ActionEvent mouseEvent) {
		Node n = (Node) mouseEvent.getSource();
		Stage stage = (Stage) n.getScene().getWindow();
		stage.close();
		loadStage("ContentFac.fxml");
	}
	
	//when click the button, it will open the contentStaff.fxml and close the current window
	@FXML
	public void onBtnStaffClick(ActionEvent mouseEvent) {
		Node n = (Node) mouseEvent.getSource();
		Stage stage = (Stage) n.getScene().getWindow();
		stage.close();
		loadStage("ContentStaff.fxml");
	}
	
	
	//method to open the new scene
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
	
	//to display the time
	@FXML
	public void initialize() {
		Thread clock = new Thread(() ->{
	        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	        while(!stop) {
	        	try {
	        		Thread.sleep(1000);
	        	}catch(Exception e){
	        		System.out.println(e);
	        	}
	        	final String timenow = sdf.format(new Date());
	        	Platform.runLater(()->{
	        		time.setText(timenow);
	        	});
	        }
	        
	    });
	    clock.start();
	    
		
	}
	
	
	

	

	
	
	
	
	
}
