package dom.sample.com;

public class Person {
	String FirstName;
	String LastName;
	int age;
	
	public Person(String firstName, String lastName, int age) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + FirstName + ", lastName=" + LastName
				+ ", age=" + age + "]";
	}
	
}
