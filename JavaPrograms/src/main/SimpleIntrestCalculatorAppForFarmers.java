package main;

import java.util.Scanner;
import java.lang.String;
class Farmer
{
	static float rate=2.5f;
	float principleAmount;
	float timeDuration;
	float simpleIntrest;
	void enterValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle Amount");
		principleAmount=sc.nextFloat();
		System.out.println("Enter time Duration");
		timeDuration =sc.nextFloat();
		
	}
	void Compute()
	{
		simpleIntrest=(principleAmount*timeDuration*rate)/100;
		
	}
	void display()
	{
		System.out.println(simpleIntrest);
	}
	
	
}

public class SimpleIntrestCalculatorAppForFarmers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of user");
		
		Scanner sc=new Scanner(System.in);
		
		
		int k=sc.nextInt();
		for(int i=0;i<k;i++)
		{
			Farmer f1=new Farmer();
			System.out.println("User"+(i+1)+"Enter value");
			f1.enterValue();
			f1.Compute();
			f1.display();
		}
		
		
		

	}

}
