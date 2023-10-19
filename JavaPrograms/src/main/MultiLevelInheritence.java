package main;
import java.lang.String;
class GrandFather
{
	void display()
	{
	System.out.println("GrandFather is father of parent and Grandfather of child");
	}
	
	
	
}
class Parent1 extends GrandFather
{
	
}
class Child1 extends Parent1
{
	
}

public class MultiLevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 s=new Child1();
		s.display();
		

	}

}
