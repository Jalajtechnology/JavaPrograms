package main;
import java.lang.String;
class App
{
	static int price;
	static int count;
	{
		count++;
	}
	
	App(int price)
	{
		this.price=price;
	}
}

public class CountObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App  nokia =new  App(2000);
		App  iphone=new  App (200000);
		System.out.println(App.count);
		System.out.println(nokia.price);
		
		
		
		

	}

}
