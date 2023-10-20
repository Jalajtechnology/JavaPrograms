package main;
import java.lang.String;
class Parent
{
	void display()
	{
		System.out.println("Welcome to our program");
	}
	Parent()
	{
		System.out.println("Parent");
	}
	
}
class Child extends Parent
{
	int a;
	int b;
	Child()
	{
		this(100,200);
		
		
		
		
		
		
	}
	Child(int a,int b)
	{
		 
		
		
		this.a=a;
		this.b=b;
		
	}
	
	void show()
	{
		System.out.println(a);
	}
	
}

public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child  r=new Child();
		r.show();
		

	}

}
