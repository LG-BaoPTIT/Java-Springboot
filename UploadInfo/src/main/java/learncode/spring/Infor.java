package learncode.spring;

public class Infor {
	private String name;
	private String photo;
	public Infor() {
		super();
	}
	public Infor(String name, String photo) {
		super();
		this.name = name;
		this.photo = photo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
