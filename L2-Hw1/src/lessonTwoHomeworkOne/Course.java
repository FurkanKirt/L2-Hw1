package lessonTwoHomeworkOne;

public class Course {
	public Course() {
		System.out.println("Worked..!");
	}
	public Course(String name, int number) {
		this();
		this.name=name;
		this.number=number;
	}
	
	String name;
	int number;
}
