package kodlamaIoProject;

public class Student extends User {
	
	String studentCode;

	public Student() {
		
	}

	public Student(String studentCode) {
		this();
		this.studentCode = studentCode;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

}
