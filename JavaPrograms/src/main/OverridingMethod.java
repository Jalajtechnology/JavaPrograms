package main;
import java.lang.String;
class Loan
{
	float principal;
	float time;
	float simpleIntrest;
	public void simpleIntrest()//overriding 
	{
		
	}
}
class PersonalLoan extends  Loan
{
	float rate=7;
	PersonalLoan(float principal, float time)
	{
		this.principal=principal;
		this.time=time;
	}
	public void simpleIntrest()//overridden method
	{
		simpleIntrest=(principal*time*rate)/100;
		System.out.println(simpleIntrest);
	}
}

public class OverridingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalLoan s=new PersonalLoan(2000,4);
		s.simpleIntrest();
		

	}

}
