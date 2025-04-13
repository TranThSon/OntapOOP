package Lab2;

public class Author {
	private String name;
	private String email;
	private char gender = 'f';

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}

	public static void main(String[] args) {
		Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
		System.out.println(ahTeck); // Test toString()
		ahTeck.setEmail("paulTan@nowhere.com"); // Test setter
		System.out.println("name is: " + ahTeck.getName()); // Test getter
		System.out.println("email is: " + ahTeck.getEmail()); // Test getter
		System.out.println("gender is: " + ahTeck.getGender()); // Test getter
	}

}
