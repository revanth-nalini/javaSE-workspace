package constructor;

public class OverLoadingConstructor {

	String name="A";
	int age=20;
	
	public OverLoadingConstructor() 
	{
		/*
		 * cannot refer to instance field 
		 * this(name,age);
		 */
		this("B");
		/*
		 * constructor called first 
		 * String n = "C"; 
		 * this(n);
		 */
		System.out.println("First Constructor");
	}
	public OverLoadingConstructor(String name) 
	{
		this(name,10); // name is a local variable
		/*
		 * only one constructor call allowed 
		 * this(10);
		 */		
		System.out.println("Second Constructor");
	}
	public OverLoadingConstructor(String name, int age) 
	{
		/*
		 * can only be called using this 
		 * OverLoadingConstructor(10);
		 */
		/*
		 * recursive constructor calls not allowed
		 *  this("D");
		 */
		System.out.println("Third Constructor");
	}
	public OverLoadingConstructor(int age) 
	{
		System.out.println("Fourth Constructor");
	}

	public static void main(String[] args)
	{
		OverLoadingConstructor olc = new OverLoadingConstructor();
	}
}

