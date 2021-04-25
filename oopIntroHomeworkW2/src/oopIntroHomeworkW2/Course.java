package oopIntroHomeworkW2;

public class Course {
	public Course()
	{
		
	}
	public Course(int id, String name, int price, String instructor, boolean active){
		this.id = id;
		this.name = name;
		this.price = price;
		this.instructor = instructor;
		this.active = active;
	}
	
	int id;
	String name;
	int price;
	String instructor;
	boolean active;
	

}
