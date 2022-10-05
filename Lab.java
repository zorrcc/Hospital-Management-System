import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Lab {
	//Create variable and private all the lab and cost
	private SimpleStringProperty lab;
	private SimpleIntegerProperty cost;
	//default constructor
	public Lab() {
		
	}
	//accessor of lab
	public String getLab() {
		return lab.get();
	}
	//mutator of lab
	public void setLab(String lab) {
		this.lab = new SimpleStringProperty(lab);
	}
	//accessor of cost
	public int getCost() {
		return cost.get();
	}
	//mutator of cost
	public void setCost(int cost) {
		this.cost = new SimpleIntegerProperty(cost);
	}
	//constructor
	public Lab(String lab, int cost) {
		this.lab = new SimpleStringProperty(lab);
		this.cost = new SimpleIntegerProperty(cost);
	}
	
	
}
