package accessModifier;

class GrandParentProtected
{
	protected String grandName = "GParent";
}

class ParentProt extends GrandParentProtected
{
	protected String parentName = "Parent";
}

public class Protected extends ParentProt	
{
	protected String childName = "Child";
	
	public static void main(String[] args) {
		Protected p = new Protected();
		System.out.println("GrandParent : " + p.grandName);
		System.out.println("Parent      : " + p.parentName);
		System.out.println("Child       : " + p.childName);
	}
}
