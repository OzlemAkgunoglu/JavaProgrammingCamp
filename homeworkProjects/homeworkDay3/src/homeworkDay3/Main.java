package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		UserManager userManager=new UserManager();
		Student student=new Student();
		student.setName("Ayşe");
		student.setSurname("Yılmaz");
		student.getProgress();
		userManager.addUser(student);
		
		Instructor instructor=new Instructor();
		instructor.setName("İlyas");
		instructor.setSurname("Çelik");
		instructor.setInstructerInfo("Tahıl Teknolojisi");
		userManager.addUser(instructor);
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.addInstructerInfo("Doçent Dr.");
		
		StudentManager studentManager=new StudentManager();
		studentManager.calculateProgress(35);
		
		
		
		
		
	}

}
