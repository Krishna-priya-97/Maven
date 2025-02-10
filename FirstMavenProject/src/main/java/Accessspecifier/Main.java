package Accessspecifier;

public class Main {
	
	public void publicmethod()
	{
		System.out.println("it is a public method");	
	}
		private void privatemethod()
		{
			System.out.println("it is a private method");	
		}
	protected void protectedmethod()
	{
		System.out.println("it is a protected method");	
	}
	void defaultmethod()
	{	
	System.out.println("it is a default method");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main obj=new Main();
obj.publicmethod();
obj.privatemethod();
obj.protectedmethod();
obj.defaultmethod();
	}

}
