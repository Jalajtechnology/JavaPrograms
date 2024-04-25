package ExceptionHandling;

public class Nestrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			try
			{
			int n1=10;
			int n2=0;
			int outcome =n1/n2;
			}
			catch (Exception e)
			{
				System.out.println("Welcome please change n2 above zero");
				
			}
			finally
			{
				System.out.println("Connection terminated");
				
			}
			
		}
		catch(Exception e)
		{
			try
			{
				int n4=5;
				int n6=0;
			    int result=n4/n6;
				
			}
			catch (Exception f)
			{
				System.out.println("Enter value above zero  for n6");
				
			}
			finally
			{
				System.out.println("Connection Termonated");
				
			}
		}
		finally
		{
			System.out.println("Thanks for using Application");
		}
		
	}

	

}
