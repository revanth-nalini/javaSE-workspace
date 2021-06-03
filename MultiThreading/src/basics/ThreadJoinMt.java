package basics;

public class ThreadJoinMt {

	static class MyThread extends Thread{
		
		static Thread mt;
		
		public void run() {
			try {
//				mt.join();
				mt.join(10000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			for(int i=0; i<10; i++) {
				System.out.println("Rama Thread");
			}
		}
		
	}
	
	public static void main(String[] args) {
		MyThread.mt = Thread.currentThread();
		
		MyThread t = new MyThread();
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Seetha");
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
