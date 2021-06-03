package finalType;

public class FinalArray 
{	
	static final String[] s = {"Chotu","Kiran"}; 
	static final String name = "Chotu";
	
	public static void main(String[] args) 
	{	
		final int a =10;
//		public int a =10;	not valid with access modifier
		System.out.println(s[0]);
		s[0]="Revanth";
		System.out.println(s[0]);
//		name="Revanth";		constant value
		System.out.println(name);
	}	
}
