package multilevelinheritance;

public class parentB extends parentA {

	public void parentB()
	{
		System.out.println("METHOD OF PARENTB");
	}
		public static void main(String[] args) {
			
			parentB obj=new parentB();
			
			obj.parentB();
			obj.parentA();
	}
		// TODO Auto-generated method stub

	

}
