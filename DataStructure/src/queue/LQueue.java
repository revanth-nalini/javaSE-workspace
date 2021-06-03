package queue;

class Node {
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	
}

public class LQueue {
	
	Node head;
	
	public boolean enQueue(int x) {
		Node n = new Node(x);
		if(head==null) {
			head=n;
			return true;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;
		return true;
	}
	
	public Node deQueue() {
		Node temp=head;
		if(!isEmpty()) {
			head=head.next;
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public static void main(String[] args) {
		LQueue l = new LQueue();
		System.out.println(l.enQueue(1));
		l.enQueue(2);
		l.enQueue(3);
		l.enQueue(4);
		l.enQueue(5);
		System.out.println(l.deQueue().data);
	}
	
}
