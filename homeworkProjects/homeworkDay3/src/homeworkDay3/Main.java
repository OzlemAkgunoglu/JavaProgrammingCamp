package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		UserManager userManager=new UserManager();
		Student student=new Student();
		student.setName("Ay�e");
		student.setSurname("Y�lmaz");
		student.getProgress();
		userManager.addUser(student);
		
		Instructor instructor=new Instructor();
		instructor.setName("�lyas");
		instructor.setSurname("�elik");
		instructor.setInstructerInfo("Tah�l Teknolojisi");
		userManager.addUser(instructor);
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.addInstructerInfo("Do�ent Dr.");
		
		StudentManager studentManager=new StudentManager();
		studentManager.calculateProgress(35);
		
		
		
		
		
	}

}
