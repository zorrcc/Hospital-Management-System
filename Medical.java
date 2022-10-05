import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Medical {
	//declaring variables for Medical class
	private SimpleStringProperty name;
	private SimpleStringProperty manufacturer;
	private SimpleStringProperty expiryDate;
	private SimpleIntegerProperty cost;
	private SimpleIntegerProperty count;
	
	public Medical() {
		
	}
	
	//Getter and Setter for the variables
	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.name = new SimpleStringProperty(name);
	}
	public String getManufacturer() {
		return manufacturer.get();
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = new SimpleStringProperty(manufacturer);
	}
	public int getCost() {
		return cost.get();
	}
	public void setCost(int cost) {
		this.cost = new SimpleIntegerProperty(cost);
	}
	public int getCount() {
		return count.get();
	}
	public void setCount(int count) {
		this.count = new SimpleIntegerProperty(count);
	}
	
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = new SimpleStringProperty(expiryDate);
	}
	public String getExpiryDate() {
		return expiryDate.get();
	}
	//parameterized constructor
	public Medical(String name, String manufacturer, String expiryDate, int cost, int count) {
		this.name = new SimpleStringProperty(name);
		this.manufacturer = new SimpleStringProperty(manufacturer);
		this.expiryDate = new SimpleStringProperty(expiryDate);
		this.cost = new SimpleIntegerProperty(cost);
		this.count = new SimpleIntegerProperty(count);
	}
	
	
	
}
