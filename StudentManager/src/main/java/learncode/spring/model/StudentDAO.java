package learncode.spring.model;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	public static List<Student> ls = new ArrayList<>();
	
	public int add(Student st) {
		ls.add(st);
		return 1;
	}
	public List<Student> getAll(){
		return ls;
	}
}
