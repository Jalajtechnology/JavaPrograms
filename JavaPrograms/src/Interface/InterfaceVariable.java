package Interface;
interface IRemote
{
	int min_Volume=0;
}

public class InterfaceVariable implements IRemote{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(min_Volume);*/
		int min_Volume=20;
		System.out.println(IRemote.min_Volume);
		System.out.println(min_Volume);
		

	}

}
