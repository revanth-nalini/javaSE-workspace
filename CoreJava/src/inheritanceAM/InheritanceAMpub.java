package inheritanceAM;

class ParentInheritanceAMpub
{
	public void disppriv() 
	{
		System.out.println("Private");
	}
	public void dispdef() 
	{
		System.out.println("Default");
	}
	public void dispprot() 
	{
		System.out.println("Protected");
	}
	public void disppub() 
	{
		System.out.println("Public");
	}
}

public class InheritanceAMpub extends ParentInheritanceAMpub
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
	 * protected void dispprot() 
	 * {
	 * System.out.println("Protected"); 
	 * }
	 */
	public void disppub() 
	{
		System.out.println("Public");
	}

}