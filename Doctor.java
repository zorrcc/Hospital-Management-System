import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Doctor {
	//private all the id, name, specialist, workTime, qualification and room
	private SimpleStringProperty id;
	private SimpleStringProperty name;
	private SimpleStringProperty specialist;
	private SimpleStringProperty workTime;
	private SimpleStringProperty qualification;
	private SimpleIntegerProperty room;
	//default constructor of Doctor class
	public Doctor() {
		
	}
	//accessor of id
	public String getId() {
		return id.get();
	}
	//mutator of id
	public void setId(String id) {
		this.id = new SimpleStringProperty(id);
	}
	//accessor of name
	public String getName() {
		return name.get();
	}
	//mutator of name
	public void setName(String name) {
		this.name = new SimpleStringProperty(name);
	}
	//accessor of specialist
	public String getSpecialist() {
		return specialist.get();
	}
	//mutator of specialist
	public void setSpecialist(String specialist) {
		this.specialist = new SimpleStringProperty(specialist);
	}
	//accessor of workTime
	public String getWorkTime() {
		return workTime.get();
	}
	//mutator of workTime
	public void setWorkTime(String workTime) {
		this.workTime = new SimpleStringProperty(workTime);
	}
	//accessor of qualification
	public String getQualification() {
		return qualification.get();
	}
	//mutator of qualification
	public void setQualification(String qualification) {
		this.qualification = new SimpleStringProperty(qualification);
	}
	//accessor of room
	public int getRoom() {
		return room.get();
	}
	//mutator of room
	public void setRoom(int room) {
		this.room = new SimpleIntegerProperty(room);
	}
	//constructor of Doctor class
	public Doctor(String id, String name, String specialist, String workTime, String qualification, int room) {
		this.id = new SimpleStringProperty(id);
		this.name = new SimpleStringProperty(name);
		this.specialist = new SimpleStringProperty(specialist);
		this.workTime = new SimpleStringProperty(workTime);
		this.qualification = new SimpleStringProperty(qualification);
		this.room = new SimpleIntegerProperty(room);
	}
	
	
	
}
