package ExceptionHandling;

import java.util.Scanner;

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
	public void verify()
	{
		if(userid !=userid1)
		{
			System.out.println("Please enter the correct user id enter user id is correct");
		}
		else
		{
			System.out.println("Please verify successfully") ;
		}
	}
}
class Bank
{
	public void initiate()
	{
		ATM h= new ATM();
		h.enterDetails();
		h.verify();
	}
}

public class CustomizedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		b1.initiate();

	}

}
