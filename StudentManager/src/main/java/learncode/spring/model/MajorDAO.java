package learncode.spring.model;
import java.util.*;
public class MajorDAO {
	public static List<Major> ls = new ArrayList<>();
	
	public List<Major> getAll(){
		ls.clear();
		ls.add(new Major(1,"WEB"));
		ls.add(new Major(2,"CNTT"));
		ls.add(new Major(1,"Mobile"));
		return ls;
	}
	public Major findById(int id) {
		for(Major major : ls) {
			if(major.getId()==id) {
				return major;
			}
		}
		return null;
	}
}
