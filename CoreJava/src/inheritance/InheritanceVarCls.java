package inheritance;

class ParentInheritanceVarCls
{
	static String fam = "India";
	static String name = "Parent";
	static String house = "Chennai";
	String car = "Benz";
}

public class InheritanceVarCls extends ParentInheritanceVarCls
{
	static String name = "Child";
	String house = "Chennai";
	static String car = "Benz";
	
	public static void main(String[] args) 
	{
		System.out.println(fam); 
		System.out.println(name);
//		System.out.println(house); house refers to instance var
		System.out.println(car);
	}
}
