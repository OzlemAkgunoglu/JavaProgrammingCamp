package homeworkDay3;

public class User {
	private int id;
	private String name;
	private String surname;
	private String email;
	private String username;
	private String password;
	private String course;
	
	//Constructors
	
	public User() {
		
	}
	
	

	public User(int id,String name, String surname, String email, String username, String password,String course) {
		super();
		this.id= id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.course= course;
	}


	//Getter and Setters
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
