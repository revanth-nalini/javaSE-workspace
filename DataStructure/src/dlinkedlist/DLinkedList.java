package dlinkedlist;

class Node {
	
	int data;
	Node next;
	Node prev;
	
	public Node(int x) {
		this.data=x;
		this.prev=null;
		this.next=null;
	}
	
}

public class DLinkedList {
	
	Node head;
	
	public Node insert(int x) {
		Node n = new Node(x);
		if(head==null) {
			head=n;
			return head;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;
		n.prev=temp;
		return head;
	}
	
	public Node delete(int ind) {
		if(ind==0) {
			head = head.next;
			head.prev.next=null;
			head.prev=null;
			return head;
		}
		Node temp=head;
		int count=1;
		while(count!=ind) {
			temp=temp.next;
			count++;
		}
		temp.next=temp.next.next;
		temp.next.prev=temp;
		return head;
	}
	
	public void trav() {
		Node temp= head;
		while(temp!=null) {
			System.out.print(temp.data + " <-> ");
			temp=temp.next;
		}
		System.out.println(temp);
	}
	
	public void revtrav() {
		Node temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		while(temp!=null) {
			System.out.print(temp.data + " <-> ");
			temp=temp.prev;
			
		}
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		DLinkedList d = new DLinkedList();
		d.insert(1);
		d.insert(2);
		d.insert(3);
		d.insert(4);
		d.insert(5);
		d.trav();
//		d.delete(0);
		d.delete(2);
		d.revtrav();
	}
	
}