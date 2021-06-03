package inheritance;

class ParentInheritanceExc
{
	public void disp() throws Exception 
	{
		System.out.println("Parent Disp");
	}
	public void show() throws ArithmeticException
	{
		System.out.println("Parent Show");
	}
	public void cast() throws ClassCastException
	{
		System.out.println("Parent Cast");
	}
	public void post() throws Exception
	{
		System.out.println("Parent Post");
	}
	public void screen() 
	{
		System.out.println("Parent Screen");
	}
}

public class InheritanceExc extends ParentInheritanceExc
{
	public void disp() throws IndexOutOfBoundsException 
	{
		System.out.println("Child Disp");
	}
	public void show() throws NullPointerException
	{
		System.out.println("Child Show");
	}
	/*
	 * public void cast() throws Exception 
	 * {
	 * System.out.println("Child Cast"); 
	 * }
	 */
	public void post() 
	{
		System.out.println("Child Post");
	}
	/*
	 * public void screen() throws Exception // handled with try catch 
	 * {
	 * System.out.println("Child Screen"); 
	 * }
	 */
}
