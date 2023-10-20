package main;
import java.lang.String;
class Parentt
{
	//Instance Variable
	int a;
	int b;
	Parentt(int a,int b)//a and b are local
	
	{
		this.a=a;
		this.b=b;
		System.out.println("Parent Constructor is called");
		
	}
	
}
class Childd extends Parentt
{
	//Instance Variable
	int x;
	int y;
	Childd()
	{
		this(111,222);
		x=100;
		y=200;
	}
	//if more than one constructor with same name inside class then atleast one super should be present inside one of them
	Childd(int x,int y)
	{
		super(x,y);
	}
	void show()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
	
}


public class ConstructorImplementationInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childd c=new Childd();
		c.show();

	}

}
