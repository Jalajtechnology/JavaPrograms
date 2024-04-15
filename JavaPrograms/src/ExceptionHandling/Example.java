package ExceptionHandling;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner sc=new Scanner(System.in);
		int n1;
		int n2;
		int size;
		int element;
		int position;
		System.out.println("Enter the first no");
		n1=sc.nextInt();
		System.out.println("Enter the second no");
		n2=sc.nextInt();
		int result=n1/n2;
		System.out.println("result is"+result);
		System.out.println("Enter the size");
		size=sc.nextInt();
		int[] arr=new int [size];
		System.out.println("Enter the element");
		element=sc.nextInt();
		System.out.println("Enter the Position");
		position=sc.nextInt();
		arr[position]=element;
		System.out.println("Element at "+position+"element is "+element);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter value greater than zero for denominator");
		}
		catch (ArrayIndexOutOfBoundsException aei)
		{
			System.out.println("Please enter value within size");
		}
		
		catch (Exception f)
		{
			System.out.println("enter correct value");
		}
		System.out.println("Connection terminated");
	}

	

}
