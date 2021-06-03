package basics;

public class ThreadSyncDemo {

	static class Display{
		
		public synchronized void displayC() {
			for(int i=0; i<10; i++) {
				System.out.print(i);
				try {
					Thread.sleep(2000);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
		public synchronized void displayN() {
			for(int j=65; j<=75; j++) {
				System.out.print((char)j);
				try{
					Thread.sleep(2000);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	}
	
	static class MyThread extends Thread {
		
		Display d;
		
		public MyThread(Display d) {
			this.d=d;
		}
		
		public void run() {
			d.displayC();
		}
		
	}
	
	static class NyThread extends Thread {
		
		Display d;
		
		public NyThread(Display d) {
			this.d=d;
		}
		
		public void run() {
			d.displayN();
		}
		
	}
	
	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d);
		NyThread t2 = new NyThread(d); 
		t1.start();
		t2.start();
	}
	
}
