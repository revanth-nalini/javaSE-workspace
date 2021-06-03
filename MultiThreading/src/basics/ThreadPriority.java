package basics;

public class ThreadPriority {

	static class MyThread extends Thread {
		
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(15);
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		MyThread t = new MyThread();
		System.out.println(t.getName() + " : " + t.getPriority());
	}
	
}
