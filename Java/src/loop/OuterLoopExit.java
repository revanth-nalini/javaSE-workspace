package loop;

public class OuterLoopExit 
{	
	public static void main(String[] args) 
	{
		System.out.println("Start");
		
		outerloop:
		for(int i=0; i<5; i++) {
			System.out.println("Outer Loop");
			innerloop:
			for(int j=0; j<2; j++) {
				if(i==1 && j==1) {
					break outerloop;
				}
				System.out.println("Inner Loop");
			}
		}
		System.out.println("End");
	}
}
