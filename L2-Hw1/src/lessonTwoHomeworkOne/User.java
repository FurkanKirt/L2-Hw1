package lessonTwoHomeworkOne;

public class User {
	
	public User() {
		System.out.println("Worked!");
	}
	
	public User(String id,String fullname,String password) {
		this ();
		this.id=id;
		this.fullname=fullname;
		this.password=password;
	}
	
	String id;
	String fullname;
	String password;
	
}
