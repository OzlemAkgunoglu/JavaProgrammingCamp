package homeworkDay2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + Angular)", 0, "Engin Demiro�",
				"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + React)", 0, "Engin Demiro�",
				"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
		Course course3 = new Course(3, "Programlamaya Giri� ��in Temel Kurs", 0, "Engin Demiro�",
				"PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.");

		Course[] courses = { course1, course2, course3 };
		
		for (Course course : courses) {
			System.out.println(course.name + course.price + course.lecturer + course.description);
		}

		Category category1 = new Category(1, "Programlama", "Programlamaya y�nelik kurslar");
		
		Category[] categories= {category1};
		for (Category category : categories) {
			System.out.println(category.name + category.detail);
		}
		
		CourseManager courseManager= new CourseManager();
		courseManager.enrollCourse(course1);
		courseManager.updateCourse(course3);
		

	}

}
