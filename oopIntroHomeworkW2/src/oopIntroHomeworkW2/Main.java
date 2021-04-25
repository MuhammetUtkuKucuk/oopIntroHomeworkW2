package oopIntroHomeworkW2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazilim Gelistirici Yetistirme Kampi (JAVA + REACT)", 0, "Engin Demirog", true);
		Course course2 = new Course(2, "Yazilim Gelistirici Yetistirme Kampi (C# + ANGULAR)", 0, "Engin Demirog", true);
		Course course3 = new Course(3, "Programlamaya Giris Icin Temel Kurs", 1000, "Engin Demirog", false);
		
		Course[] courses = {
				course1,course2,course3
		};
		System.out.println("---Courses---");
		for (Course course : courses) {
			System.out.println("Course Id : "+ course.id + "\nCourse Name : "+ course.name + "\nCourse Price : "+ course.price + "\nCourse Instructor : "+ course.instructor + "\nIsItActive : "+course.active);
			System.out.println("-------------");
		}
		
		Instructor instructor1 = new Instructor(1, "Engin Demirog", true);
		
		Instructor[] instructors = {instructor1};
		System.out.println("\n---Instructors---");
		for (Instructor instructor : instructors) {
			System.out.println("Instructor Id : "+instructor.id+ "\nInstructor Name : "+instructor.name + "\nIsItActive : "+instructor.active);
			System.out.println("-------------");
		}
		System.out.println();
		CourseService courseService1 = new CourseService();
		courseService1.Add(course1);
		courseService1.Delete(course2);
		
		

	}

}
