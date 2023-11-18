package ManyMany;

public class Student2 {
	private String sName;
	Courses[]c;
	public Student2(String sName, Courses[] c) {
		super();
		this.sName = sName;
		this.c = c;
	}
	public void getStudentDetails()
	{
		System.out.println("Student Details");
		System.out.println(sName);
		System.out.println("Courses Details");
		
		for(Courses j:c)
		{
			System.out.print(j.cid+" ");
			System.out.print(j.ccost);
			System.out.print(j.cname);
			System.out.println();
		}
		System.out.println();
	}
	

}
