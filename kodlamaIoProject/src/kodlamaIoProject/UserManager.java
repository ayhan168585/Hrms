package kodlamaIoProject;

public class UserManager {
	
	public void userAdd(User user) {
		System.out.println("Kullanýcý eklendi. "+ user.getFirstName() + user.getLastName());
	}
	
	public void userDelete(User user) {
		System.out.println("Kullanýcý silindi. "+ user.getFirstName() + user.getLastName());
	}
	
	public void courseAdd(Course course) {
		System.out.println("Kurs eklendi." +course.getCourseName());
	}
	
	public void courseDelete(Course course) {
		System.out.println("Kurs silindi." +course.getCourseName());
	}

}
