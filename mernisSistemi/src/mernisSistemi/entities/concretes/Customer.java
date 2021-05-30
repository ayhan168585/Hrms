package mernisSistemi.entities.concretes;


public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private String nationalityNumber;
	public Customer() {
		super();
	}
	public Customer(int id, String firstName, String lastName, int birthYear, String nationalityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.nationalityNumber = nationalityNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getNationalityNumber() {
		return nationalityNumber;
	}
	public void setNationalityNumber(String nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	} 
}
