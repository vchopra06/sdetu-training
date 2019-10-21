public class User {
	private String firstName;
	private String lastName;
	
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
	
	public String output() {
		return firstName + " " + lastName;
	}
	
	public String getFirstName() {     //getter method
		return firstName;
	}
	
	public void setFirstName(String fn) {  //setter method
		firstName = fn;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String ln) {
		lastName = ln;
	}
}
