package homeworkDay3;

public class Course {
	private int id;
	private String name;
	private double price;
	private String lecturer;
	private String description;
	
	
	public Course() {

	}

	public Course(int id, String name, double price, String lecturer, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.lecturer = lecturer;
		this.description = description;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
