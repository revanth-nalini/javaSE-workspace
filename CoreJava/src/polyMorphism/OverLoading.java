package polyMorphism;

public class OverLoading 
{
	public short run(int i) 
	{
		System.out.println("inside int");
		return (short)i;
	}
	public long run(byte b) 
	{
		System.out.println("inside byte");
		return b;
	}
	/*
	 * public void run(int i)	// independent of return type
	 * { 
	 * System.out.println("inside int"); 
	 * }
	 */
	public void run(byte b, int i) 
	{
		System.out.println("inside byte int");
	}
	public void run(int i, byte b) 
	{
		System.out.println("inside int byte");
	}
	public void run() 
	{
		System.out.println("inside void");
	}
	
	public static void main(String[] args) 
	{
		OverLoading ol = new OverLoading();
		byte b = 2;
		ol.run(b);
		int i = b;
		ol.run(i);
		ol.run(b, i);
		ol.run(i, b);
		ol.run();
	}
}
