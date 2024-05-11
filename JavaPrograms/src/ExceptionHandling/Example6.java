package ExceptionHandling;

public class Example6  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int c=10/0;
			System.out.println(c);
		}
		finally
		{
			System.out.println("connection terminated due to faulty input");
			
		}

	}

}
