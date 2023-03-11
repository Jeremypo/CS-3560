public class Student {
	//variables
	private String name;
	private String major;
	private Double gpa;
	
	//constructors
	public Student() {};
	public Student(String name, String major) {
		this.name = name;
		this.major = major;
	}
	public Student(String name, String major, Double gpa) {
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}
	
	//setter and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	
	//returns name, major, and gpa
	public String toString() {
		return (getName() + ", " + getMajor() + ", " + getGpa());
	}
	
	//return true if student name and major are the same
	public boolean equals(Student student) {
		return(student.getName().equals(name) && student.getMajor().equals(major));
	}
}
