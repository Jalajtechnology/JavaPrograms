package main;
import java.lang.String;
class Demo
{
	//static variable memory allocated in heap during class loading and accessed anywhere.
	static int a;
	static int b;
	static //static block to initialize value to static variable.
	{
		System.out.println("Static method get executed");
		a=10;
		b=20;
	}
	 static void  disp()
	{
		 System.out.println("Static method is called");
		
	}
	 //Instance Variable
	
	int x;
	int y;
	Demo(int x,int y)
	{
		System.out.println("constructor is called");
		this.x=x;
		this.y=y;
		
	}
	void disp1()
	{
		System.out.println("NON static method is called");
		System.out.println(x);
		System.out.println(y);
	}
	
	
}

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fist static method which will call is main method by jvm after that depends on programmer whethrt he want to create object first then call static method or non static method or reverse
		Demo.disp();
		Demo d=new Demo(40,50);
		d.disp1();
		
		

	}

}
