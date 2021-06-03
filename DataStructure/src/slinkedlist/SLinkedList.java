package slinkedlist;

class Node {
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	
}

public class SLinkedList {

	Node head;
	
	public Node insert(int x) {
		Node n = new Node(x);
		if(head==null) {
			head=n;
			return head;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;
		return head;
	}
	
	public Node delete(int ind) {
		if(ind==0) {
			head=head.next;
			return head;
		}
		Node temp=head;
		int count=1;
		while(count!=ind) {
			temp=temp.next;
			count++;
		}
		temp.next=temp.next.next;
		return head;
	}
	
	public void trav() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " -> ");
			temp=temp.next;
		}
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		SLinkedList s = new SLinkedList();
		s.insert(1);
		s.insert(2);
		s.insert(3);
		s.insert(4);
		s.insert(5);
		s.trav();
//		s.delete(0);
		s.delete(2);
		s.trav();
	}
	
}
