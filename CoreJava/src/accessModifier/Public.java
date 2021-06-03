package accessModifier;

class GrandParentPublic
{
	public String grandName = "GParent";
}

class ParentPublic extends GrandParentPublic
{
	public String parentName = "Parent";
}

public class Public extends ParentPublic	
{
	public String childName = "Child";
	
	public static void main(String[] args) {
		Public p = new Public();
		System.out.println("GrandParent : " + p.grandName);
		System.out.println("Parent      : " + p.parentName);
		System.out.println("Child       : " + p.childName);
	}
}
