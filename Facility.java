import javafx.beans.property.SimpleStringProperty;

public class Facility {
	//declaring variables for Facility class
	private SimpleStringProperty facility;
	
	//Default constructor
	public Facility() {
		
	}
	//Getter and Setter for the variables
	public String getFacility() {
		return facility.get();
	}

	public void setFacility(String facility) {
		this.facility = new SimpleStringProperty(facility);
	}
	//parameterized constructor
	public Facility(String facility) {
		this.facility = new SimpleStringProperty(facility);
	}
	
}
