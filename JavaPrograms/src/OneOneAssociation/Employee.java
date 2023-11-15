package OneOneAssociation;

public class Employee {
	String eid;
	String ename;
	String eadd;
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
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(account.accountno);
		System.out.println(account.accounttype);
		
	}
	

}
