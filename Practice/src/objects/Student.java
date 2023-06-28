package objects;

// Constructor overloading

public class Student {
	String name;
	int rollno;
	int age;
	String gender;
	long primaryContact;
	long secondaryContact;
	static {
		System.out.println("Your Schoolname is Attack on titan");
	}
	public Student(String name, int age, int rollno, String gender) {
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.gender = gender;
	}
	public Student(String name, int age, int rollno, String gender,long primaryContact) {
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.gender = gender;
		this.primaryContact=primaryContact;
	}

	public Student(String name, int rollno, int age, String gender, long primaryContact, long secondaryContact) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.gender = gender;
		this.primaryContact = primaryContact;
		this.secondaryContact = secondaryContact;
	}
	public void details() {
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(primaryContact);
		System.out.println(secondaryContact);
		
	}
	public static void main(String[] args) {
		Student st=new Student("Eren", 14, 04, "male");
		st.details();
		Student st1=new Student("Mikasa", 13, 05, "Female",9864652314l);
		st1.details();
		Student st2=new Student("Armin", 14, 01, "male", 678904321l,7865423167l);
		st2.details();
	}
}
