package static_example;

public class Parent {
	
	public static void display() {
		System.out.println("display method in parent class");
	}
	public static void main(String[] args) {
		Child child = new Child();
		child.display();
	}

}
class Child{
	

	
}
