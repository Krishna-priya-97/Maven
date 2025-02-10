package superkeyword;

public class child extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child obj=new child();
obj.instance();
	}
	public void instance()
	{
		super.instanceparent();
		System.out.println("method of child class");
		System.out.println("instance variable of parent class=" +super.a);
		System.out.println("instance variable of child class="+a);
	}

	public child()
	{
		super();
		System.out.println("costructor of child class");
	}
}
