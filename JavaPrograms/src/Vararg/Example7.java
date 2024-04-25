package Vararg;
class Head
{
	public  void  multiply()
	{
		
	}
}
class Subhead extends Head
{
	public  void multiply()
	{
		super.multiply();
	}
}

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subhead c=new Subhead();
		c.multiply();
		

	}

}
