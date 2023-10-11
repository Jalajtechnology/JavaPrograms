package main;
import java.lang.String;
class Student
{
	private int age;
	public void setAge(int age)
	{
		this.age=age;
		
	}
	public int getAge()
	{
		return age;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student();
		st1.setAge(24);
		Student st2=new Student();
		st2.setAge(30);
		System.out.print(st1.getAge());
		System.out.print(st2.getAge());
		

	}

}
