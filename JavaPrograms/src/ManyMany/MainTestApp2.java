package ManyMany;

public class MainTestApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courses c1 =new Courses("1","1000","Java");
		Courses c2=new Courses("2","2000","Python");
		Courses[]c=new Courses[2];
		c[0]=c1;
		c[1]=c2;
		Student2 s1=new Student2("Jalaj",c);
		Student2 s2=new Student2("Kartikeya",c);
		s1.getStudentDetails();
		s2.getStudentDetails();

	}

}
