package main;
import java.lang.String;
class Parent34
{
	void cry()
	{
		System.out.println("Parent is crying");
	}
}
class Child34 extends Parent34
{
	void cry()
	{
		System.out.println("Child is crying");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent34 s=new Parent34();//jvm call method based on type of object.
		s.cry();
		 s=new Child34(); //jvm call method based on type of object.
		s.cry();

	}

}
