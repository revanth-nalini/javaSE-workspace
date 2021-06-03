package inheritanceAM;

class ParentInheritanceAMpriv
{
	private void disppriv() 
	{
		System.out.println("Private");
	}
	private void dispdef() 
	{
		System.out.println("Default");
	}
	private void dispprot() 
	{
		System.out.println("Protected");
	}
	private void disppub() 
	{
		System.out.println("Public");
	}
}

public class InheritanceAMpriv extends ParentInheritanceAMpriv
{
	private void disppriv() 
	{
		System.out.println("Private");
	}
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
