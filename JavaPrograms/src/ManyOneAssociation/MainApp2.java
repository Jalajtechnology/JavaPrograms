package ManyOneAssociation;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first dependent will be coded first.
		Branch b1=new Branch();
		b1.setBranchName("INeuron");
		Student s1=new Student();
		s1.setStudentCourse("Fullstack java");
		s1.setStudentName("Jalaj");
		s1.setStudentBranch(b1);
		System.out.println("Student s1 Details");
		System.out.print(s1.getStudentCourse()+" ");
		System.out.print(s1.getStudentName()+" ");
		System.out.print(s1.getStudentBranch().getBranchName()+" ");
		System.out.println();
		System.out.println("Student s2 Details");
		
		Student s2=new Student();
		s2.setStudentCourse("FullStackWebDevelopment");
		s2.setStudentName("SatyamTiwari");
		s2.setStudentBranch(b1);
		System.out.print(s2.getStudentCourse()+" ");
		System.out.print(s2.getStudentName()+" ");
		System.out.print(s2.getStudentBranch().getBranchName()+" ");
		
		
		
		
		

	}

}
