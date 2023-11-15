package OneOneAssociation;
import java.lang.String;

public class Main {
	public static void main(String[]args)
	{
	Account ac=new Account("1234","jalaj","Savings");
	Employee e1=new Employee("123","jalaj","Lucknow",ac);
	e1.getDetails();
	}

}
