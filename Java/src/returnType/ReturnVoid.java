package returnType;


public class ReturnVoid 
{
	public static void walk() {
		System.out.println("walk method");
		return;
//		System.out.println("still walking"); 
	}
	public static void main(String[] args) {
		System.out.println("main start");
		walk();
		System.out.println("main end");
	}
}
