package main;
import java.lang.String;
class Students
{
	private int age;
	public Students(int age)
	{
		this.age=age;
	}
	public Students()
	{
		age=18;
	}
	public int getAge() {
		return age;
	}
	
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st1=new Students(10);
		Students st2=new Students();//Constructor overloading.
		System.out.println(st1.getAge());
		System.out.println(st2.getAge());

	}

}
