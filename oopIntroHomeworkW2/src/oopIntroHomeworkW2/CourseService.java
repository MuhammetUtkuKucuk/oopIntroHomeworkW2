package oopIntroHomeworkW2;

public class CourseService {
	
	public void Add(Course course)
	{
		System.out.println("Course Added: "+course.name);
	}
	public void Delete(Course course)
	{
		System.out.println("Course Deleted: "+course.name);
	}
	
}
