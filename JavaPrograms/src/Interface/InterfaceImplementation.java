package Interface;
import java.lang.String;
interface ISample
{
	void methodOne();
	void methodTwo();
	
}
abstract class Sample implements ISample
{
	public void methodOne()
	{
		System.out.println("method one implemented");
	}
}
class SubServiceProvider extends Sample
{
	public void methodTwo()
	{
		System.out.println("Method two is implemented");
	}
}

public class InterfaceImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISample ref=new SubServiceProvider();
		ref.methodOne();
		ref.methodTwo();

	}

}
