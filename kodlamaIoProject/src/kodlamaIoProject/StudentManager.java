package kodlamaIoProject;

public class StudentManager extends UserManager {
	
	public void userAdd(User user) {
		System.out.println("Student eklendi. "+ user.getFirstName() + user.getLastName());
	}
	
	public void userDelete(User user) {
		System.out.println("Student silindi. "+ user.getFirstName() + user.getLastName());
	}
	
	public void courseAdd(Course course) {
		System.out.println("Öðrenci yeni Kursa kayýt oldu." +course.getCourseName());
	}
	
	public void courseDelete(Course course) {
		System.out.println("Öðrenci kurstan kaydýný sildirdi." +course.getCourseName());
	}

}
