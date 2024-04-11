package InnerClass;
abstract class Computer
{
	public abstract void config();
}

public class AnnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer obj1=new Computer()
		{
			public void config() {
				System.out.println("Annonymous Inner Class");
			}
		};
		obj1.config();

	}

}
