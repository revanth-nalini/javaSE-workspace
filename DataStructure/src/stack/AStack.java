package stack;

public class AStack {
	
	int[] stack = new int[10];
	int ptr=-1;
	
	public void push(int x) {
		stack[++ptr] = x;
	}
	
	public int pop() {
		peek();
		ptr--;
		return stack[ptr+1];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(0);
		}
		return stack[ptr];
	}
	
	public boolean isEmpty() {
		return ptr<0;
	}
	
	public static void main(String[] args) {
		AStack s = new AStack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());	
		
		System.out.println(s.pop());	
	}

}
