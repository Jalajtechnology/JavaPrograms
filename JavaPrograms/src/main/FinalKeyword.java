package main;
import java.lang.String;
class Vehicle
{
	final int i=20;//final variable act as constant we cannot change its value;
	 final void display()
	{
		 
		System.out.println("display");
	}
}
class Bike extends Vehicle
{
	//final method will get inherited and cannot be overrided//
	 //int i=40;//data hiding  variable of parent class will get hided.
	int i=40;
	int l=super.i;
	// prooves data hiding.
	
	
	
}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike s=new Bike();
		s.display();
		System.out.println(s.l);
		System.out.println(s.i);
		

	}

}
