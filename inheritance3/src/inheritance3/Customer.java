package inheritance3;

public class Customer extends Person {
	
	
	private String email;

	public Customer() {
	}

	public Customer(String email) {
		this();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
