package Interface;
interface ILeft
{
	void m1();
}
interface IRight
{
	void m1();
}
class Implementation implements ILeft,IRight
{
	public void m1()
	{
		System.out.println("jalaj agarwal");
	}
}

public class InterfaceNamingConflictCase1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementation s=new Implementation();
		s.m1();

	}

}
