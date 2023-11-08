package OneOneAssociation;
import java.lang.String;
//Target Class

public class Employee {
	String eid;
	String ename;
	String eadd;
	//has a relationship;
	Account account;
	public Employee(String eid, String ename, String eadd, Account account) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eadd = eadd;
		this.account = account;
	}
	public void getDetails()
	{
		System.out.println("Employee details");
		System.out.println("Employee id"+eid);
		System.out.println("Employee name"+ename);
		System.out.println("Account Details");
		System.out.println("Account type"+account.acctype);
		System.out.println("Account no"+ account.accno);
		
		
	}
	
	

}
