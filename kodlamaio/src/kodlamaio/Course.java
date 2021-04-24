package kodlamaio;

public class Course {
	
	public Course() {
		
	}
	
	public Course(int id,int categoryId,int percent,String courseName,String teacherName) {
		this();
		this.id=id;
		this.categoryId=categoryId;
		this.percent=percent;
		this.courseName=courseName;
		this.teacherName=teacherName;
	}
	
	int id;
	int categoryId;
	int percent;
	String courseName;
	String teacherName;
	

}
