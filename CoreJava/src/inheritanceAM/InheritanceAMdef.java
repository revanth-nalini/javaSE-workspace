package inheritanceAM;

class ParentInheritanceAMdef
{
	void disppriv() 
	{
		System.out.println("Private");
	}
	void dispdef() 
	{
		System.out.println("Default");
	}
	void dispprot() 
	{
		System.out.println("Protected");
	}
	void disppub() 
	{
		System.out.println("Public");
	}
}

public class InheritanceAMdef extends ParentInheritanceAMdef
{
	/*
	 * private void disppriv() 
	 * { 
	 * System.out.println("Private"); 
	 * }
	 */
	void dispdef() 
	{
		System.out.println("Default");
	}
	protected void dispprot() 
	{
		System.out.println("Protected");
	}
	public void disppub() 
	{
		System.out.println("Public");
	}
}
