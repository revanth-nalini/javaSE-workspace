package inheritanceAM;

class ParentInheritanceAMprot
{
	protected void disppriv() 
	{
		System.out.println("Private");
	}
	protected void dispdef() 
	{
		System.out.println("Default");
	}
	protected void dispprot() 
	{
		System.out.println("Protected");
	}
	protected void disppub() 
	{
		System.out.println("Public");
	}
}

public class InheritanceAMprot extends ParentInheritanceAMprot
{
	/*
	 * private void disppriv() 
	 * { 
	 * System.out.println("Private"); 
	 * } 
	 * void dispdef() 
	 * {
	 * System.out.println("Default"); 
	 * }
	 */
	protected void dispprot() 
	{
		System.out.println("Protected");
	}
	public void disppub() 
	{
		System.out.println("Public");
	}
}
