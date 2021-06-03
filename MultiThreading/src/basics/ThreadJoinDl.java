package basics;

public class ThreadJoinDl {

	static class MyThread extends Thread {
		
		static Thread mt;
		
		public void run() {
			try {
				mt.join();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Child");
		}
		
	}
	
	public static void main(String[] args) {

		/*
		try {
		Thread.currentThread().join();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		
		MyThread.mt = Thread.currentThread();
		
		MyThread t = new MyThread();
		t.start();
		try {
			t.join();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main");
	}
	
}
