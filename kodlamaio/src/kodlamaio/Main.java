package kodlamaio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Category category1=new Category();
		category1.id=1;
		category1.categoryName="Programlama";
		
		Course course1=new Course(1,1,70,"C#-Angular","Engin Demiroð");
		Course course2=new Course();
		course2.id=2;
		course2.categoryId=1;
		course2.percent=55;
		course2.courseName="Java-React";
		course2.teacherName="Engin Demiroð";
		
		Course[] courses= {
				course1,course2
		};
		
		for(Course course:courses) {
			System.out.println("Course Name:"+course.courseName);
			System.out.println("Finished percent:"+course.percent);
			System.out.println("Teacher Name:"+course.teacherName);
			System.out.println("-----------------------------------------------");
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.addRegister(course1);
		courseManager.addRegister(course2);
		System.out.println("---------------------------------------------------");
		courseManager.DeleteRegister(course1);
		


	

}
}
