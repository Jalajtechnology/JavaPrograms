package ExceptionHandling;
import java.util.*;
class Branch1
{
	void  disp() throws ArithmeticException
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the values");
		 int n1=sc.nextInt();
		 int n2=sc.nextInt();
		 int result=n1/n2;
		 System.out.println(result);
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Branch1 b=new Branch1();
			b.disp();
		}
		catch(Exception e)
		{
			System.out.println("Write correct value");
		}

	}

}
