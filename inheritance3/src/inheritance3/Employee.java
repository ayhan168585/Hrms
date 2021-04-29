package inheritance3;

public class Employee extends Person {
	
	
	private double salary;

	public Employee() {
	}

	public Employee(double salary) {
		this();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
