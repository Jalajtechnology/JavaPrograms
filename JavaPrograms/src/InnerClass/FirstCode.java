package InnerClass;
class A
{
	public  void show()
	{
		System.out.println("IN show");
	}
	  class B //Inner class;
	{
		public   void config()
		{
			System.out.println("in config");
		}
	}
}

public class FirstCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		A.B obj2;
		obj2=obj.new B();
		obj2.config();
		//A.B.config();//correct if B and config are static.
		
		
		

	}

}
