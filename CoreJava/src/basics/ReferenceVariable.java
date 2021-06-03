package basics;

public class ReferenceVariable 
{
	String instanceVariable = "referenced";
	static String staticVariable = "referenced";
	
	public void instanceMethod() 
	{
		System.out.println("I am referenced");
	}
	public static void staticMethod() 
	{
		System.out.println("I am referenced");
	}
	
	public static void main(String[] args)	// doesn't work 
	{
		/*
		 * ReferenceVariable rv; 
		 * rv.instanceMethod();
		 * rv.staticMethod();
		 * System.out.println(rv.instanceVariable);
		 * System.out.println(rv.staticVariable);
		 */
	}	
}
