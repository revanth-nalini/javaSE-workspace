package basics;

public class ThreadName {
	
	static class MyThread extends Thread{
		
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		Thread t1 = new Thread();
		System.out.println(t1.getName());
		
		MyThread t2 = new MyThread();
		t2.start();
		
		Thread.currentThread().setName("nomain");
		System.out.println(Thread.currentThread().getName());
	}
	
}
