package hierarchial_inheritance;

public class child1 extends parentclass{

	public void second()
	{
		System.out.println("method of child class");
	}
	public static void main(String[] args) {
		
		child1 obj1=new child1();
		obj1.second();
	}
	
	public child1() {
		
		System.out.println("constructor of child1");

	}

}
