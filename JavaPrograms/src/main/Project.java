package main;

import java.util.Scanner;
import java.lang.String;

abstract class Shapes
{
	float area;
	//Abstraction
	abstract void input();
	abstract void compute();
	abstract void display();
}
class Rectangle extends Shapes
{
	float length;
	float breadth;
	void input()
	{
		System.out.println("called");
		Scanner p =new Scanner(System.in);
		System.out.println("Enterthe length");
		length=p.nextFloat();
		System.out.println("Enter the Breadth");
		breadth=p.nextFloat();
	}
	void compute()
	{
		area=length*breadth;
	}
	void display()
	{
		System.out.println("area of rectange is "+ area);
	}
	
}
class Geometry
{
	
	void permit(Shapes s)
	{
		System.out.println("called");
		s.input();
		s.compute();
		s.display();
	}
}

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometry g=new Geometry();
		Rectangle r=new Rectangle();
		g.permit(r);
		          

	}

}
