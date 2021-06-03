package basics;

public class ThreadSyncCls {

	static class Display {
		
		public static synchronized void wish(String name) {
			for(int i=0; i<10; i++) {
				System.out.print("Good Morning : ");
				try {
					Thread.sleep(2000);
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
		
		public MyThread(Display d, String name) {
			this.d=d;
			this.name=name;
		}
		
		public void run() {
			Display.wish(name);
		}
		
	}
	
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread t1 = new MyThread(d1,"Revanth");
		MyThread t2 = new MyThread(d2,"Sundar");
		t1.start();
		t2.start();
	}
	
}
