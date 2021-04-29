package kodlamaIoProject;

public class Instructor extends User {
	
	String instructorCode;

	public Instructor() {
		
	}

	public Instructor(String instructorCode) {
		this();
		this.instructorCode = instructorCode;
	}

	public String getInstructorCode() {
		return instructorCode;
	}

	public void setInstructorCode(String instructorCode) {
		this.instructorCode = instructorCode;
	}

}
