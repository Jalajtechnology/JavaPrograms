package main;
import java.lang.String;
class AutoMobiles
{
	int i=10;//overridden instance
	void display()
	{
		System.out.println("jalaj agarwal");
		
	}
}
class HondaCity extends AutoMobiles
{
	int i=20;//overridden instance
	
	void display()//overridden method
	{
		
		System.out.println("jalaj Agarwal Child class");
		super.display();
		System.out.println(super.i);
		//super=AutoMobiles s=new AutoMobiles();
		//s.display();
		
		
	}
}

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HondaCity s=new HondaCity();
		s.display();
		
		
		

	}

}
