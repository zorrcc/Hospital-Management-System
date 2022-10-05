import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Staff {
	//Create variable and private all the id, name, designation, sex, and salary
	private SimpleStringProperty id;
	private SimpleStringProperty name;
	private SimpleStringProperty designation;
	private SimpleStringProperty sex;
	private SimpleIntegerProperty salary;
	//default constructor
	public Staff() {
		
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
	//accessor of designation
	public String getDesignation() {
		return designation.get();
	}
	//mutator of designation
	public void setDesignation(String designation) {
		this.designation = new SimpleStringProperty(designation);
	}
	//accessor of sex
	public String getSex() {
		return sex.get();
	}
	//mutator of sex
	public void setSex(String sex) {
		this.sex = new SimpleStringProperty(sex);
	}
	//accessor of salary
	public int getSalary() {
		return salary.get();
	}
	//mutator of salary
	public void setSalary(int salary) {
		this.salary = new SimpleIntegerProperty(salary);
	}
	//constructor
	public Staff(String id, String name, String designation, String sex, int salary) {
		this.id = new SimpleStringProperty(id);
		this.name = new SimpleStringProperty(name);
		this.designation = new SimpleStringProperty(designation);
		this.sex = new SimpleStringProperty(sex);
		this.salary = new SimpleIntegerProperty(salary);
	}
	
}
