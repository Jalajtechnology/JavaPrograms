package Interface;
abstract class Shape
{
	int x,y;
	Shape(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println(this.hashCode());
	}
}
class Circle extends Shape
{
	int radius;
	Circle(int x,int y,int radius)
	{
		super(x,y);
		this.radius=radius;
		System.out.println(this.hashCode());
	}
	
}


public class InheritenceInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(5,7,2);
		System.out.println(c.hashCode());
		//To proof only one object is created .

	}

}
