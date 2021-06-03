package basics;

public class ThreadSyncBlkCls {
	
	static class Display{
		
		public void wish(String name) {
			System.out.print(1);
			System.out.print(2);
			System.out.print(3);
			System.out.print(4);
			System.out.print(5);
			synchronized(Display.class){
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
			System.out.print(6);
			System.out.print(7);
			System.out.print(8);
			System.out.print(9);
			System.out.print(10);
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
			d.wish(name);
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
