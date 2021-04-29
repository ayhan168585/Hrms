package kodlamaIoProject;

public class InstructorManager extends UserManager {
	
	public void userAdd(User user) {
		System.out.println("Instructor eklendi. "+ user.getFirstName() + user.getLastName());
	}
	
	public void userDelete(User user) {
		System.out.println("Instructor silindi. "+ user.getFirstName() + user.getLastName());
	}
	
	public void courseAdd(Course course) {
		System.out.println("Instructor yeni kurs ekledi." +course.getCourseName());
	}
	
	public void courseDelete(Course course) {
		System.out.println("Instructor kursu yayýndan kaldýrdý." +course.getCourseName());
	}

}
