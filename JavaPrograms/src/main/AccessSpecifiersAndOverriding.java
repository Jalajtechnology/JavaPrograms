package main;
import java.lang.String;
class Plane
{
	void fly()
	{
		System.out.println("plane  is flying");
	}
	void land()//Inherited Method
	{
		System.out.println("plane is landing");
	}
	void takeOff()//Inherited Method
	{
		System.out.println("plane takeoff");
	}
}
class CargoPlane extends Plane
{
	void fly() //overridden method
	{
		System.out.println("CP flies at lower height");
	}
}
class PassengerPlane extends Plane
{
	void fly()//overridden method
	{
		System.out.println("PP flies at medium height");
	}
	void carryGoods()// specialized methods.
	{
		
	}
}

 

public class AccessSpecifiersAndOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane s=new CargoPlane();
		s.fly();
		

	}

}
