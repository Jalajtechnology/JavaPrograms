package main;
import java.lang.String;
class Mobile
{
	private int cost;
	Mobile(int cost) //Constructor called at a time of object creation.
	{
		this.cost=cost;
	}
	public int getCost()
	{
		return cost;
	}
	
	
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile st=new Mobile(10000);
		int cost=st.getCost();
		System.out.println(cost);
		

	}

}
