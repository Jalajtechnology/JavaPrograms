package Hiding;
class Parent2
{
	public static void display()
	{
		System.out.println("Parent");
	}
}
class Child2 extends Parent2
{
	public static void display()
	{
		System.out.println("child");
	}
}

public class MethodHiding {
	public static void main(String...args)
	{
	Parent2 p=new Child2();
	p.display();
	}
	

}
