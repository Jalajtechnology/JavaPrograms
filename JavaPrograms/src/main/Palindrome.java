package main;
import java.lang.String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="jalaj";
		StringBuffer s=new StringBuffer();
		s.append(s1);
		s.reverse();
		for(int i=s1.length()-1;i>=0;i--)
		{
			if(s1.charAt(i)!=s.charAt(i))
			{
				System.out.println("false");
			}
		}
		System.out.println("true");
		
		

	}

}
