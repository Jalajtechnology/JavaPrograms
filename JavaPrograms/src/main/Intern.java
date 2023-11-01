package main;
import java.lang.String;

public class Intern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("java");
		String s2=new String("java");
		System.out.println(s1.intern());
		System.out.println(s2==s1.intern());

	}

}
