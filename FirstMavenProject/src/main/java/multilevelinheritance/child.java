package multilevelinheritance;

public class child extends parentB{
	
	public void child()
	{
		System.out.println("method of child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child obj=new child();
obj.parentB();
obj.parentA();
obj.child();	}

}
