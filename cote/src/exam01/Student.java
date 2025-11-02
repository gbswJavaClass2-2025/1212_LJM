package exam01;

public class Student {
	private String name;
	private String email;
	private String id;
	
	public Student(String name, String email, String id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	public String GetName() {
		return this.name;
	}
	public void SetEmail(String email) {
		this.email = email;
	}
	public String GetEmail() {
		return email;
	}
	public void SetId(String id) {
		this.id = id;
	}
	public String GetId() {
		return id;
	}
}
