package studentGUI;

import java.util.*;

public class StudentList {
	public static ArrayList<Student> sList = new ArrayList<Student>();

	public static void addStudent(Student s) {
		sList.add(s);
	}
	
	public static ArrayList<Student> getList(){
		return sList;
	}
}
