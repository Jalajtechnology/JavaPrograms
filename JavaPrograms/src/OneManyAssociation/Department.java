package OneManyAssociation;

public class Department {
	String departmentName;
	Employee1[] emp;

	public Department(String departmentName,Employee1[]emp) {
		super();
		this.departmentName = departmentName;
		this.emp=emp;
	}
	public void getDetails()
	{
		for(Employee1 j:emp)
		{
			System.out.print(j.employeeName);
			System.out.print(j.location);
			System.out.print(j.salary);
			System.out.print(departmentName);
			System.out.println();
		}
	}
	

}
