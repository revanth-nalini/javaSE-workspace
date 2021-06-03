package basics;

public class ThreadWN {
	
	static class MyThread extends Thread {
		
		int total;
		
		public void run() {
			synchronized(this){
				for(int i=1; i<=100; i++) {
					total+=i;
				}
				this.notify();
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		MyThread t = new MyThread();
		t.start();
//		Thread.sleep(1000);
		synchronized(t) {	
			t.wait();
//			t.wait(1000);
		}			
		System.out.println(t.total);
	}
	
}
