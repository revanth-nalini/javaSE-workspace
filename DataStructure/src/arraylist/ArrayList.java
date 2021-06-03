package arraylist;

public class ArrayList{
	
	int[] array = new int[2];
	int ptr;
	
	public void insert(int x) {
		if(array.length>ptr) {
			array[ptr]=x;
			ptr++;
		}
		else {
			int[] cparray = new int[array.length*2];
			for(int i=0; i<array.length; i++) {
				cparray[i]=array[i];
			}
			cparray[ptr]=x;
			ptr++;
			array=cparray;
		}
	}
	
	public int delete() {
		ptr--;
		int hold = array[ptr];
		if(ptr<=array.length/2) {
			int[] cparray = new int[array.length/2];
			for(int i=0; i<ptr; i++) {
				cparray[i]=array[i];
			}
			array=cparray;
		}
		return hold;
	}
	
	public void trav() {
		for(int i=0; i<ptr; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.insert(1);
		a.insert(2);
		a.trav();
		System.out.println("\nLength of array : " + a.array.length);
		a.insert(3);
		a.insert(4);
		a.trav();
		System.out.println("\nLength of array : " + a.array.length);
		System.out.println(a.delete());
		a.trav();
		System.out.println("\nLength of array : " + a.array.length);
		System.out.println(a.delete());
		a.trav();
		System.out.println("\nLength of array : " + a.array.length);
	}
	
}