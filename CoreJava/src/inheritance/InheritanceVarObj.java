package inheritance;

class ParentInheritanceVarObj 
{
	String name = "Dad";
	String mother = "Mom";
	static String company = "Amazon";
	static String home = "India";
}

public class InheritanceVarObj extends ParentInheritanceVarObj
{
	String name = "Son";
	String wife = "Wife";
	static String company = "Morgan";
	static String house = "America";
	
	public static void main(String[] args)
	{
		InheritanceVarObj iv = new InheritanceVarObj();
		System.out.println(iv.name);
		System.out.println(iv.wife);
		System.out.println(iv.mother);
		System.out.println(iv.company);
		System.out.println(iv.home);
		System.out.println(iv.house);
		
		ParentInheritanceVarObj piv = new ParentInheritanceVarObj();
		System.out.println("\n" + piv.name);
		System.out.println(piv.mother);
		System.out.println(piv.company);
		System.out.println(piv.home);
				
				
		ParentInheritanceVarObj pc = new InheritanceVarObj();
		System.out.println("\n" + pc.name);
		System.out.println(pc.mother);
		System.out.println(pc.company);
		System.out.println(pc.home);
	}
}
