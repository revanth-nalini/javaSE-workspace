package basics;

public class ThreadInterrupt {

	static class MyThread extends Thread{
		
		public void run() {
			try {
				for(int i=0; i<10; i++) {
					System.out.println("Child Thread");
					Thread.sleep(2000);
				}
			}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}

	}
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("Main Method");
	}
	
}
