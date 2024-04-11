package Vararg;



public class VarargMethods {
	public void  methodOne(Object O)//methodOverloading
	{
		System.out.println("Implicit Type Casting");
	}
	public void methodOne(int i)
	{
		System.out.println("implicit type casting");
	}
	public void methodOne(Integer i)
	{
		System.out.println("AutoBoxing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		VarargMethods obj=new VarargMethods();
		obj.methodOne(x);

	}


}
