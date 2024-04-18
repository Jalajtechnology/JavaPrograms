package ExceptionHandling;
import java.util.*;

import java.util.Scanner;

class Alpha
{
	void alpha()
	{
	Scanner t=new Scanner(System.in);
	
	
	int n1;
	int n2;
	System.out.println("Enter the first no");
	n1=t.nextInt();
	System.out.println("Enter the second no");
	n2=t.nextInt();
	int result=n1/n2;
	System.out.println("result is"+result);
	
	}
}
class Beta
{
	void beta()
	{
		Alpha a=new Alpha();
		a.alpha();
	}
}


public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Beta b=new Beta();
			b.beta();
		}
		catch (ArithmeticException e)
		{
			System.out.println("Please insert value greater than zero");
		}

	}

}
