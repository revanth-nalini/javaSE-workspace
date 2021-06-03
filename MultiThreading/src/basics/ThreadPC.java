package basics;

public class ThreadPC {
	
	int apple;
	
	static class Producer extends Thread{
		
		static ThreadPC pc;
		
		public void run() {
			synchronized(pc) {
				while(pc.apple<500) {
					pc.apple+=100;
				}
				System.out.println("After Production : " + pc.apple);
				pc.notify();
			}
		}
		
	}
	
	static class Consumer extends Thread{
		
		static ThreadPC pc;
		
		public void run() {
			synchronized(pc) {
				while(pc.apple>10) {
					pc.apple-=2;
					System.out.println("After Consumption : " + pc.apple);
				}
				try {
					pc.wait();
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		ThreadPC pc = new ThreadPC();
		Producer t1 = new Producer();
		Consumer t2 = new Consumer();
		Producer.pc = pc;
		Consumer.pc = pc;
		t2.start();
		t1.start();
	}
	
}
