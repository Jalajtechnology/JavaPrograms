package Hiding;
class Parent
{
	int i=10;
	
}
class Child extends Parent
{
	int  i=20;
	
}
public class DataHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		System.out.println(p.i);

	}

}
