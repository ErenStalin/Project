package encapsulation;

public class EmployeExecutive {

	public static void main(String[] args) {
		Employee e1=new Employee("Goku", 203, 15000.00, "martial Art except");
		Employee e2=new Employee("Vegeta", 201, 25000.00, "martial Art Prince");
		Employee e3=new Employee("Krillin", 202, 20000.00, "martial Art junior");
		e1.setEid(5);
		e2.setSalary(30000.00);
		displayDetails(e1);
		displayDetails(e2);
		displayDetails(e3);

	}
	public static void displayDetails(Employee e) {
		System.out.println("name :"+e.getName());
		System.out.println("Eid :"+e.getEid());
		System.out.println("Salary"+e.getSalary());
		System.out.println("Designation :"+e.getDesignation());
		e.working();
	}

}
