package inheritance;

class C
{
	
}

class D extends C
{
	
}

public class InheritanceInherit 
{
	void print(C c) {
		System.out.println("C");
	}
	void print(D d) {
		System.out.println("D");
	}
	
	public static void main(String[] args) 
	{
		InheritanceInherit ii = new InheritanceInherit();
		C c = new C();
		ii.print(c);
		D d = new D();
		ii.print(d);
		C cd = new D();
		ii.print(cd);
	}
}
