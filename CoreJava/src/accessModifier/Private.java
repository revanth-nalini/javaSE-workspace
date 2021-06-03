package accessModifier;

class GrandParentPrivate
{
	private String grandName = "GParent";
	
	public String getGrandName() {
		return grandName;
	}
}

class ParentPrivate extends GrandParentPrivate
{
	private String parentName = "Parent";
	
	public String getParentName() {
		return parentName;
	}
}

public class Private extends ParentPrivate
{
	private String childName = "Child";
	
	public static void main(String[] args) {
		Private p = new Private();
//		System.out.println("GrandParent : " + p.grandName);
//		System.out.println("Parent      : " + p.parentName);
		System.out.println("GrandParent : " + p.getGrandName());
		System.out.println("Parent      : " + p.getParentName());
		System.out.println("Child       : " + p.childName);
	}
}
