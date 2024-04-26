 package ExceptionHandling;
 
 import java.util.Scanner;
 class UnderAgeException extends Exception
 {
	 
 }
 class OverAgeException extends Exception
 {
	 
 }
 class Applicant
 {
	 int age;
	 public void enterAge()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter your age");
		 age=sc.nextInt();
	 }
	 public void verifyAge() throws UnderAgeException,OverAgeException 
	 {
		 if(age<18)
		 {
			 OverAgeException i= new OverAgeException();
			 throw i;
			 
		 }
		 else if(age>60)
		 {
			 UnderAgeException i1=new UnderAgeException();
			 throw i1;
			 
		 }
		 else 
		 {
			 System.out.println("You are egligible for using this application");
		 }
		 
	 }
 }
 class Rto
 {
	 public void initiate()
	 {
		 Applicant s1=new Applicant();
		 s1.enterAge();
		 try {
			s1.verifyAge();
		 }
		catch (OverAgeException | UnderAgeException e) {
			// TODO Auto-generated catch block
			System.out.println("Please provide correct age age >18 and less than 60");
			try
			{
				s1.enterAge();
				s1.verifyAge();
			}
			catch(OverAgeException | UnderAgeException  e1)
			{
				System.out.println(" due to continious providing wrong input  blocked");
				System.exit(0);
			}
		}
				 
				 
		      
		 
	 }
	 
 }

public class CustomizedException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rto r=new Rto();
		r.initiate();

	}

}
