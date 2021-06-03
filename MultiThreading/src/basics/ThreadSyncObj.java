package basics;

public class ThreadSyncObj {

	static class Display {
		
		public synchronized void wish(String name) {
			for(int i=0; i<10; i++) {
				System.out.print("Good Morning : ");
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println(name);
			}
		}
	}
	
	static class MyThread extends Thread{
		
		Display d;
		String name;
		
		public MyThread( Display d,String name) {
			this.name = name;
			this.d=d;
		}
		
		public void run() {
			d.wish(name);
		}
		
	}
	
	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d,"Revanth");
		MyThread t2 = new MyThread(d,"Sundar"); 
		t1.start();
		t2.start();
	}
	
}
