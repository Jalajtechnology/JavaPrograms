package ExceptionHandling;
class Student
{
	
}


public class ISInstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj=new Student();
		
		if(obj instanceof Student)
		{
			Student s=(Student)obj;
			System.out.println("obj can hold instance of student as there is relationship between student and object");
			
		}
		else
		{
			System.out.println("true");
		}

	}

}
