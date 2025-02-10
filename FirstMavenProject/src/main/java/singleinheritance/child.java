package singleinheritance;

public class child extends parent {

	public static void main(String[] args) {
		
		child c=new child();
		c.name();
		c.inheritance();

	}
public void inheritance()
{
	System.out.println("method of child class");
}
}
