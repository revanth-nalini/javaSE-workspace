package inheritance;

class ParentInheritanceMethCls
{
	public static void name() 
	{
		System.out.println("Dad");
	}
	public static void mother()
	{
		System.out.println("Mom");
	}
	public void company() {
		System.out.println("Amazon");
	}
}

public class InheritanceMethCls extends ParentInheritanceMethCls
{
	public static void name() 
	{
		System.out.println("Child");
	}
	/*	 
	 * instance method cannot override static method
	 * public void mother()	 
	 * { 
	 * System.out.println("Mom"); 
	 * }
	 */	
	public static void wife() {
		System.out.println("Wife");
	}
	/*
	 * static method cannot hide instance method 
	 * public static void company()
	 * { 
	 * System.out.println("Morgan"); 
	 * }
	 */

	 
	public static void main(String[] args) {
		name();
		wife();
		mother();
	}
}
