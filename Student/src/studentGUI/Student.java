package studentGUI;

public class Student {
	String name, usn, address, category;
	int age;
	float[] gpa = new float[8];
	float cgpa;
	public Student(String name, String usn, int age, String address, String category, float[] gpa) {
		this.name = name;
		this.usn = usn;
		this.age = age;
		this.address = address;
		this.category = category;
		this.gpa = gpa;
	}
	public void setCGPA() {
		float cgpa = 0;
		for(float i : this.gpa) {
			cgpa += i;
		}
		cgpa = cgpa / 8;
		this.cgpa = cgpa;
	}
	public String toString() {
		return "Name : "+this.name+" USN : "+this.usn+" Age : "+this.age+" Category : "+this.category+" CGPA : "+this.cgpa;
	}
}
