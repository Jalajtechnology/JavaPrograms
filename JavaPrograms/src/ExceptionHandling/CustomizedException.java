package ExceptionHandling;

import java.util.Scanner;

class InvalidInput extends Exception
{
	
}
class ATM
{
	int userid=123;
	int userid1;
	public void enterDetails()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter user id");
		 userid1=sc.nextInt();
	}
	public void verify() throws InvalidInput
	{
		if(userid ==userid1)
		{
			System.out.println("User verified successfully");
		}
		else
		{
			// Throwing already handled exception ;
			System.out.println("You have entered Wrong input Please enter correct input");
			InvalidInput i= new InvalidInput();
			System.out.println(i);
			throw i;
		}
	}
}
class Bank
{
	public void initiate()
	{
		ATM h= new ATM();
		h.enterDetails();
		try {
			h.verify();
		} catch (InvalidInput e) {
			// TODO Auto-generated catch block
			try
			{
				h.enterDetails();
				h.verify();
			}
			catch(InvalidInput f)
			{
				try
				{
					h.enterDetails();
					h.verify();
				}
				catch(InvalidInput s)
				{
					System.out.println("Atm blocked due to wrong input multiple times");
					System.exit(0);
				}
				
			}
			
		}
	}
}

public class CustomizedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		b1.initiate();

	}

}
