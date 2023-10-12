package main;
import java.lang.String;
class Dog
{
	private String name;
	private int cost;
	public Dog()
	{
		this("sheru",9000);
	}
	public Dog(String name,int cost)
	{
		this.name=name;
		this.cost=cost;
	}
	public String  getName()
	{
		return name;
	}
}

public class ThisKeywordAndThisMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		System.out.println(d1.getName());

	}

}
