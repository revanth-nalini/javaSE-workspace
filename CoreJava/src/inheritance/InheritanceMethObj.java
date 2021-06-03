package inheritance;

class ParentInheritanceMethObj 
{
	public void name() 
	{
		System.out.println("Dad");
	}
	public void mother() 
	{
		System.out.println("Mom");
	}
	public static void company() 
	{
		System.out.println("Amazon");
	}
}

public class InheritanceMethObj extends ParentInheritanceMethObj
{
	public void name() 
	{
		System.out.println("Son");
	}
	/*
	 * static method cannot hide instance method
	 * public static void mother() 
	 * { 
	 * System.out.println("Mom");	
	 * }
	 */
	public void wife() {
		System.out.println("Wife");
	}
	public static void company() {
		System.out.println("Morgan");
	}
	/*	
	 * instance method cannot override static method
	 * public void company() 
	 * { 
	 * System.out.println("Google"); 
	 * }
	 */
	
	public static void main(String[] args) 
	{
		InheritanceMethObj im = new InheritanceMethObj();
		im.name();
		im.wife();
		im.mother();
		im.company();
		
		ParentInheritanceMethObj pim = new ParentInheritanceMethObj();
		System.out.println();
		pim.name();
		pim.mother();
		pim.company();
		
		ParentInheritanceMethObj pc = new InheritanceMethObj();
		System.out.println();
		pc.name();
		pc.mother();
		pc.company();
	}
}
