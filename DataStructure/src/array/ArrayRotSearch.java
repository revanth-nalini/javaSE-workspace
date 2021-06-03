package array;

public class ArrayRotSearch {

	int[] array = {1,2,3,4,5,6,7,8};
	
	public static void main(String[] args) {
		ArrayRotSearch a = new ArrayRotSearch();
		System.out.println(a.search(6));
	}
	
	public int search(int x) {
		return search(x,0,array.length-1);
	}
	
	public int search(int x, int start, int end) {
		
		int mid=(end+start)/2;
		if(x==array[mid]) {
			return mid;
		}
		else if(x<array[mid]) {
			return search(x,start,mid-1);
		}
		else {
			return search(x,mid+1,end);
		}
	}
	
}
