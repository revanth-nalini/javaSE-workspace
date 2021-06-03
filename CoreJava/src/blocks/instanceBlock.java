package blocks;

public class instanceBlock 
{
	public static void main(String[] args)
	{
		System.out.println("main method");
		instanceBlock ib1 = new instanceBlock();
		System.out.println(ib1.name + " " + ib1.lastName);
		instanceBlock ib2 = new instanceBlock();
		System.out.println(ib2.name + " " + ib2.lastName);
	}	
	
	// sequential execution of instance block & static variables
	// runs each time at object creation
	String name;	
	 
	{	
		System.out.println("instance block");
		System.out.println(name);
//		System.out.println(lastName);	does not exist at this level
		lastName = "lastName";
	}
	{
		System.out.println("name initialization");
		name="firstName";
		lastName="middleName lastName";
	}
	
	String lastName;	
}