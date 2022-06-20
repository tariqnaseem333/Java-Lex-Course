package array;

public class Teacher {
	
	private String teacherName;
	private String subject;
	private double salary;
	
	
//	Constructor Function
	public Teacher( String teacherName, String subject, double salary ) {
		this.teacherName = teacherName;
		this.subject = subject;
		this.salary = salary;
	}
	
	
//	Display Details of Teacher
	public void diplayDetails() {
		System.out.println("Name: " + teacherName + " " + "Subject: " + subject + " " + "Salary: " + salary);
	}
	
	
//	Getter and Setters
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
