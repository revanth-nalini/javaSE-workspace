package stack;

class Node {
	
	int data;
	Node next;
	
	public Node(int x) {
		this.data=x;
		this.next=null;
	}
	
}

public class LStack {

	Node head;
	
	public boolean push(int x) {
		Node n = new Node(x);
		if(head==null) {
			head=n;
			return true;
		}
		n.next=head;
		head=n;
		return true;
	}
	
	public Node pop() {
		Node temp = head;
		if(!isEmpty()) {
			head = head.next;
		}
		return temp;
	}
	
	private boolean isEmpty() {
			return head==null;
	}
	
	public static void main(String[] args) {
		LStack l = new LStack();
		System.out.println(l.push(1));
		l.push(2);
		l.push(3);
		l.push(4);
		l.push(5);
		System.out.println(l.pop().data);
	}
	
}
