package lessonTwoHomeworkOne;

public class Main {
	public static void main(String[] args) {
	
	User user1=new User();
	user1.id="12345";
	user1.fullname="Gökhan";
	user1.password="yaRaLıGöKü";
	
	User user2=new User("12344","Furkan","fkkkkk");
	
	User[] users= {user1,user2};
	
	for(User user:users) {
		System.out.println(user.password);
	}
	
	Course course1=new Course();
	course1.name="java";
	course1.number=2;
	
	Course course2=new Course("c#",1);
	
	Course[] courses= {course1,course2};
	
	for (Course course:courses) {
		System.out.println(course.number);
	}
	UserManager userManager=new UserManager();
	userManager.addToUser(user1);
	userManager.addToUser(user2);
	
	}

}
