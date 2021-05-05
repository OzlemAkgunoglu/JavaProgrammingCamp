package homeworkDay2;

public class Course {
	public Course() {

	}

	public Course(int id, String name, double price, String lecturer, String description) {
		this();
		this.id = id;
		this.name = name;
		this.price = price;
		this.lecturer = lecturer;
		this.description = description;
	}

	int id;
	String name;
	double price;
	String lecturer;
	String description;
}
