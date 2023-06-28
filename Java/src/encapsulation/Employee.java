package encapsulation;

public class Employee {
	private String name;
	private int eid;
	private double salary;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>this.salary)
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void working() {
		System.out.println(name+" is working as "+designation);
	}
	public Employee(String name, int eid, double salary, String designation) {
		this.name = name;
		this.eid = eid;
		this.salary = salary;
		this.designation = designation;
	}

}
