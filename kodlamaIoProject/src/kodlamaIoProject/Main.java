package kodlamaIoProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1=new Course();
		course1.setId(1);
		course1.setCourseName("C#-Angular");
		Course course2=new Course();
		course2.setId(2);
		course2.setCourseName("Java-React");
		
	 Instructor user=new Instructor();
	 user.setUserId(1);
	 user.setNationalIdentity("12345678910");
	 user.setInstructorCode("I12345");
	 user.setFirstName("Engin");
	 user.setLastName("Demiroğ");
	 user.setEmail("engin@engin.com");
	 
	 Student user2=new Student();
	 user2.setUserId(2);
	 user2.setNationalIdentity("12345678101");
	 user2.setStudentCode("S12345");
	 user2.setFirstName("Ayhan");
	 user2.setLastName("Özer");
	 user2.setEmail("ayhan@ayhan.com");
	 
		
		
		UserManager userManager=new InstructorManager();
		UserManager userManager2=new StudentManager();
		
		userManager.userAdd(user);
		userManager.userDelete(user);
		userManager.courseAdd(course1);
		userManager.courseDelete(course1);
		System.out.println("------------------------------------------------------");
		
		userManager2.userAdd(user2);
		userManager2.userDelete(user2);
		userManager2.courseAdd(course1);
		userManager2.courseDelete(course1);

	}

}
