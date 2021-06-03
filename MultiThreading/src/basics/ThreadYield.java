package basics;

public class ThreadYield {

	static class MyThread extends Thread {
		
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.println("Child Thread");
				Thread.yield();
			}
		}
		
	}
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
	
}
