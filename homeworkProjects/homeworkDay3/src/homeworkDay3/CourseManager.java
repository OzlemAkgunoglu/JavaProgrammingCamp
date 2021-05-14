package homeworkDay3;


public class CourseManager {
	public void addCourse(Course course) {
		System.out.println("Kurs Eklendi");
	}
	public void updateCourse(Course course) {
		System.out.println(course.getName()+"kursu güncellendi.");
	}
	public void deleteCourse(Course course) {
		System.out.println(course.getName()+"kursu silindi.");
	}
	
}
