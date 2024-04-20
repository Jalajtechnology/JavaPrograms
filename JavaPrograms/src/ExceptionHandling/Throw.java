package ExceptionHandling;

import java.util.Scanner;

class Branch2
{
	void disp2() throws ArithmeticException
	{
		try
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
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled in Branch2");
			throw e;
		}
		finally
		{
			System.out.println("Connection is terminated");
		}
	}
}


public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Branch2 b=new Branch2();
			b.disp2();
		}
		
		catch(ArithmeticException f)
		{
			System.out.println("Atm blocked by main branch");
		}

	}

}
