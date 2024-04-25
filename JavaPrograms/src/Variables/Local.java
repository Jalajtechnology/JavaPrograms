package Variables;

public class Local {
	int y=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		new Local().display(10);

	}
	public void display(int y)
	{
		System.out.println(y);//local variable
		System.out.println(this.y);//instance variable;
	}

}
