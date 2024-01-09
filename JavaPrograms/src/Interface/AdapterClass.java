package Interface;
interface Ix //interface 
{
	void m1();
	void m2();
}
abstract class AdaptX implements Ix//abstract class 
{
	public void m1()
	{
		
	}
	public void m2()
	{
		
	}
}
class TestApp extends AdaptX
{
	public void m1()
	{
		System.out.println("implementing m1");
	}
}


public class AdapterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ix s=new TestApp();
		s.m1();

	}

}
