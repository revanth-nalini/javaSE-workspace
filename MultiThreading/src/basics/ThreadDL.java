
package basics;

public class ThreadDL extends Thread{

	static class A {
		public synchronized void d1(B b) {
			System.out.println("Thread-1 starts execution of d1() method");
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("I am interrupted");
			}
			System.out.println("Thread-1 trying to call B's last method");
			b.last();
		}
		public synchronized void last() {
			System.out.println("Inside A last method");
		}
	}
	
	static class B {
		public synchronized void d2(A a) {
			System.out.println("Thread-2 strats execution of d2() method");
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("I am interrepted");
			}
			System.out.println("Thread-2 trying to call A's last method");
			a.last();
		}
		public synchronized void last() {
			System.out.println("Inside B last method");
		}
	}
	
	
	A a = new A();
	B b = new B();
	
	public void trigger() {
		this.start();
		b.d2(a);
	}
	
	public void run() {
		a.d1(b);
	}
	
	public static void main(String[] args) {
		 ThreadDL t = new ThreadDL();
		 t.trigger();
		 
	}
	
}
