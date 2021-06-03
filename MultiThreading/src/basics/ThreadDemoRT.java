package basics;



public class ThreadDemoRT {

	static class MyThread extends Thread{
		
		public void run() {
			System.out.println("I am Run");
		}
		
	}
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread hybridT = new Thread(t);
		hybridT.start();
		System.out.println("I am Main");
	}
	
	
}
