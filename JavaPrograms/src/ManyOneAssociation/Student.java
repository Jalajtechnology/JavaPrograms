package ManyOneAssociation;

public class Student {
	private String studentName;
	private String studentCourse;
	//has a relationship
	Branch b1;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public void setStudentBranch(Branch b1)
	{
		this.b1=b1;
	}
	public Branch getStudentBranch()
	{
		return b1; 
	}
	
	
	

}
