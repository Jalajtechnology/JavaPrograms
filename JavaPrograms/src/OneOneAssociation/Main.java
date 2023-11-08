package OneOneAssociation;
import java.lang.String;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac=new Account("12345","jalaj","saving");
		Employee e=new Employee("12","jalaj","lko",ac);
		e.getDetails();

	}

}
