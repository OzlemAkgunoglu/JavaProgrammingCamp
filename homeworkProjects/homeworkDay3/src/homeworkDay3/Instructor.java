package homeworkDay3;

public class Instructor extends User{

	private String instructerInfo;

	public Instructor() {
		
	}

	public Instructor(String instructorInfo) {
		super();
		this.instructerInfo = instructorInfo;
	}

	public String getInstructerInfo() {
		return instructerInfo;
	}

	public void setInstructerInfo(String instructerInfo) {
		this.instructerInfo = instructerInfo;
	}
	
	
}
