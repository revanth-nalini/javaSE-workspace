package basics;

public class ThreadPriorityDemo {
	
	static class MyThread extends Thread{
		
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + "I am Run");
			}			
		}
		
	}
	
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.setPriority(8);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + "I am Main");
		}
	}
	
}

/*
chotyu sridhar isa a very vad boy, he telles me lot of  lies, and ging out with girls, talking lot of 
secrets wtih his gril frieneds, , noe dsyas he has cahnged a lotl different mindset, he lieks to talk onlyh 
with his freiends, especially girls, like sujana, akila , he leos no lieke o sgtay atg home, he likes to raom
with his griel frieends, likes to go to moveies with hier {thana senda kootum, he cheats me alot, he is 420, 
taks top me like a rosdy, but to hes frines he is vry smiling and loving, so dont turst hi,m but he has 
promiesd me that he eill never lie but never keeps his word, , ammaka inda kthina parthukonga
*/ 
