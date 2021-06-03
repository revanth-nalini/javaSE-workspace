package queue;

public class AQueue {

	int[] queue = new int[5];
	int start=0, end=start;
	
	
	public void enQueue(int x) {
		if(end!=(start+5))
			queue[(end++)%5] = x;
	}
	
	public int deQueue() {
		if(start!=end) {
			int temp = queue[(start)%5];
			queue[(start)%5]=0;
			start++;
			return temp;
		}
		else {
			System.out.println("Queue is empty");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		AQueue q = new AQueue();
		q.deQueue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		
		for(int i=0; i<5; i++)
			System.out.print(q.queue[i] + " ");
		
		System.out.println("\n"+q.deQueue());
		q.enQueue(6);
		q.enQueue(7);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		q.enQueue(7);
		
		for(int i=0; i<5; i++)
			System.out.print(q.queue[i] + " ");
	}

}

