package inheritance;

class A
{
	
}

class B extends A
{
	
}

class ParentInheritanceRet
{
	public byte num() 
	{
		System.out.println("Parent");
		return 4;
	}
	public A numb() 
	{
		System.out.println("A");
		return new A();
	}
	/*
	 * public B numb() 
	 * { 
	 * System.out.println("B"); return new B(); 
	 * }
	 */
}

public class InheritanceRet extends ParentInheritanceRet
{
	/*
	 * public int num() 
	 * { 
	 * System.out.println("Child"); 
	 * return 10; 
	 * }
	 */
	public byte num() 
	{
		System.out.println("Parent");
		return 2;
	}
	public B numb()		// covariant type
	{
		System.out.println("B");
		return new B();
	}
	/*
	 * public A numb() 
	 * { 
	 * System.out.println("A"); return new A(); 
	 * }
	 */
}
