package polyMorphism;

class ParentOverRiding
{
	public short run(byte b)	// overriden method
	{
		System.out.println("inside int");
		return b;
	}
}

public class OverRiding extends ParentOverRiding
{
	public short run(byte b)	// overriding method
	{
		System.out.println("inside byte");
		return b;
	}
}
