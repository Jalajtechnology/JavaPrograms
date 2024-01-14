package Final;

final class Test

{
	final int i;
	Test(int i)
	{
		this.i=i;
		if(this.i==100)
		{
			System.out.println("Constructor called for 100");
		}
	}
	public final Test modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else 
		{
			return new Test(i);
		}
	}
}

public class ClassImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test(10);
		Test t2=t1.modify(10);
		System.out.println(t1==t2);
		
		Test t3=t1.modify(100);

	}

}
