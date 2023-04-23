package learncode.spring.model;

public class Student {
	private int id;
	private String name;
	private int mark;
	private Major major;
	public Student() {
		super();
	}
	public Student(int id, String name, int mark, Major major) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.major = major;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + ", major=" + major + "]";
	}
	
	
}
