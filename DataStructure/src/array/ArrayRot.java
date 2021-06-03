package array;

public class ArrayRot {

	int[] array = new int[] {1,2,3,4,5,6,7};
	
	public static void main(String[] args) 
	{
		ArrayRot a = new ArrayRot();
//		a.arot1(2);
//		a.arrot2(2);
//		a.arrot4(2);
		a.trav();
	}
	
	public void trav()
	{
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] +" ");
		}
	}
	
	public void arot1(int d) 
	{
		int[] temp = new int[d];
		for(int i=0; i<d; i++) {
			temp[i]=array[i];
		}
		for(int j=0; j<array.length-d; j++) {
			array[j]=array[j+d];
		}
		int m=0;
		for(int k=array.length-d; k<array.length; k++) {
			array[k]=temp[m++];
		}
	}
	
	public void arrot2(int d) 
	{
		for(int i=1; i<=d; i++) {
			int temp=array[0];
			for(int j=0; j<array.length-1; j++) {
				array[j]=array[j+1];
			}
			array[array.length-1]=temp;
		}
	}
		
	public void arrot4(int d) 
	{
		reverse(0,d-1);
		reverse(d,array.length-1);
		reverse(0,array.length-1);
	}
	
	private void reverse(int start, int end)
	{
		while(start<end) {
			int temp = array[end];
			array[end]=array[start];
			array[start]=temp;
			start++;
			end--;
		}
	}
	
}
