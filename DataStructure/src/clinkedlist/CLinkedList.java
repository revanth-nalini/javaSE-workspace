package clinkedlist;

class Node {
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
		this.next=this;
	}
	
}

public class CLinkedList {

	Node head;
	
	public Node insert(int x) {
		Node n = new Node(x);
		if(head==null) {
			head=n;
			return head;
		}
		Node temp=head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;
		return head;
	}
	
	public Node delete(int ind) {
		Node temp=head;
		if(ind%5==0) {
			while(temp.next!=head) {
				temp=temp.next;
			}
			head=head.next;
			temp.next=head;
			return head;
		}
		int count=1;
		while(count!=ind) {
			temp=temp.next;
			count++;
		}
		temp.next=temp.next.next;
		return head;
	}
	
	public void trav() {
		Node temp=head;
		while(temp.next!=head) {
			System.out.print(temp.data + " -> ");
			temp=temp.next;
		}
		System.out.println(temp.data + " -> " +temp.next.data);
	}
	
	public static void main(String[] args) {
		CLinkedList c = new CLinkedList();
		c.insert(1);
		c.insert(2);
		c.insert(3);
		c.insert(4);
		c.insert(5);
		c.trav();
//		c.delete(0);
//		c.delete(2);
		c.delete(10);
		c.trav();
		
	}
	
}
