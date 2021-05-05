package homeworkDay2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + Angular)", 0, "Engin Demiroð",
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (Java + React)", 0, "Engin Demiroð",
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
		Course course3 = new Course(3, "Programlamaya Giriþ Ýçin Temel Kurs", 0, "Engin Demiroð",
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.");

		Course[] courses = { course1, course2, course3 };
		
		for (Course course : courses) {
			System.out.println(course.name + course.price + course.lecturer + course.description);
		}

		Category category1 = new Category(1, "Programlama", "Programlamaya yönelik kurslar");
		
		Category[] categories= {category1};
		for (Category category : categories) {
			System.out.println(category.name + category.detail);
		}
		
		CourseManager courseManager= new CourseManager();
		courseManager.enrollCourse(course1);
		courseManager.updateCourse(course3);
		

	}

}
