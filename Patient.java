import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Patient {
	//declaring variables for Patient class
	private SimpleStringProperty id;
	private SimpleStringProperty name;
	private SimpleStringProperty disease;
	private SimpleStringProperty sex;
	private SimpleStringProperty admitStatus;
	private SimpleIntegerProperty age;
	
	public Patient() {
		
	}
	
	//Getter and Setter for the variables
	public String getId() {
		return id.get();
	}
	public void setId(String id) {
		this.id = new SimpleStringProperty(id);
	}
	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.name = new SimpleStringProperty(name);
	}
	public String getDisease() {
		return disease.get();
	}
	public void setDisease(String disease) {
		this.disease = new SimpleStringProperty(disease);
	}
	public String getSex() {
		return sex.get();
	}
	public void setSex(String sex) {
		this.sex = new SimpleStringProperty(sex);
	}
	public String getAdmitStatus() {
		return admitStatus.get();
	}
	public void setAdmitStatus(String admitStatus) {
		this.admitStatus = new SimpleStringProperty(admitStatus);
	}
	public int getAge() {
		return age.get();
	}
	public void setAge(int age) {
		this.age = new SimpleIntegerProperty(age);
	}
	//parameterized constructor
	public Patient(String id, String name, String disease, String sex, String admitStatus, int age) {
		this.id = new SimpleStringProperty(id);
		this.name = new SimpleStringProperty(name);
		this.disease = new SimpleStringProperty(disease);
		this.sex = new SimpleStringProperty(sex);
		this.admitStatus = new SimpleStringProperty(admitStatus);
		this.age = new SimpleIntegerProperty(age);
	}
	
	
}
