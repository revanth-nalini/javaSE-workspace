package returnType;

public class ReturnNull 
{
		public static Object walk() 
		{
			System.out.println("walk method");
			return null; 
		}

		public static void main(String[] args) {
			System.out.println("main start");
			System.out.println(walk());
			System.out.println("main end");
		}
	

}
