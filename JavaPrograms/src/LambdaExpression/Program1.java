package LambdaExpression;
interface Sub
{
	int sub(int a,int b);
}
interface Cls
{
	int getLength(String s);
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub obj=(a,b)->a-b;
		System.out.println(obj.sub(20, 30));
		Cls obj1=s->s.length();
		System.out.println(obj1.getLength("jalaj"));

	}

}
