package methodoverriding;

public class child extends parent {

	public static void main(String[] args) {
		
child obj=new child();
obj.first();
obj.second("overriding");
		
	}
	public void first()                      //non parameterised method overriding

	{
		super.first();
		System.out.println("method of child class"); 
	}
	public void second(String a)                //parameterised method overriding
	{
		super.second("parent class");
		System.out.println(a);
	}
}
