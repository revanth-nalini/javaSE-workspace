package basics;

public class ThreadJoin {

	static class MyThread extends Thread {
		
		public void run() {
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
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		try {
//			t.join();
			t.join(10000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		for(int i=0; i<10; i++) {
			System.out.println("Rama");
		}
		
	}
	
}
