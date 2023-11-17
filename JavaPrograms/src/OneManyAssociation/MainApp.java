package OneManyAssociation;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Dependent 
		 Employee1 e1=new Employee1("jalaj","Noida","25000");
		 Employee1 e2=new Employee1("Kartikeya","Hyderabad","30000");
		 Employee1 e3=new Employee1("Richa","Mumbai","35000");
		 Employee1[]emp=new Employee1[3];
		 emp[0]=e1;
		 emp[1]=e2;
		 emp[2]=e3;
		 
		 Department d1=new Department("Engineering",emp);
		 d1.getDetails();
		 //Department is target as it will shown to end user.
		 
		 

	}

}
