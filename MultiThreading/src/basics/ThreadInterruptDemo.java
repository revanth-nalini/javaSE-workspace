package basics;

public class ThreadInterruptDemo {

	static class MyThread extends Thread {
		
		public void run() {
			for(int i=0; i<10000 ; i++) {
				System.out.println(i);
			}
			try {
				System.out.println("Bed Time");
				Thread.sleep(2000);
				System.out.println("Wake Time");
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
	}
	
}
