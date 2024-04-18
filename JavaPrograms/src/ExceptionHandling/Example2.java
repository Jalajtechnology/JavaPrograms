package ExceptionHandling;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		try
		{
		
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
			System.out.println("Please enter value greater than zero for denominator");
		}
		
		try
		{
		
		int size;
		int element;
		int position;
		System.out.println("Enter the size");
		size=t.nextInt();
		int[] arr=new int [size];
		System.out.println("Enter the element");
		element=t.nextInt();
		System.out.println("Enter the Position");
		position=t.nextInt();
		arr[position]=element;
		System.out.println("Element at "+position+"element is "+element);
		}
		
		catch (ArrayIndexOutOfBoundsException aei)
		{
			System.out.println("Please enter value within size");
		}
		
		catch (Exception g)
		{
			System.out.println("enter correct value");
		}
		System.out.println("Connection terminated");

	}

}
