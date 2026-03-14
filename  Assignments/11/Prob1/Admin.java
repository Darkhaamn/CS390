package Prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> stus = new HashMap<>();

		for (Student student: students) {
			stus.put(new Key(student.getFirstName(), student.getLastName()), student);
		}

		return stus;
	}
}
