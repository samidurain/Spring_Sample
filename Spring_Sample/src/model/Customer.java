package model;

/**
 * 
 * @author Samidurai.Nadarajan
 *
 */
public class Customer {
	private String firstName;
	private String lastName;

	public Customer() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("First Name: ").append(firstName).append("Last Name: ").append(lastName);
		return sb.toString();
	}
}
