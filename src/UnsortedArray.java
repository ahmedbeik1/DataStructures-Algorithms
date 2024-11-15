
public class UnsortedArray {
	int[] array;
	int itemcount;
	public UnsortedArray(int maxSize) {
		itemcount = 0;
		array = new int[maxSize];
	}
	public void insertLast(int x) {
		if(itemcount<array.length) {
		array[itemcount++]= x;
		//itemcount++;
		}
		else {
			System.out.println("Array is full");
		}
	}
	public void insertFirst(int x) {
		if(itemcount<array.length) {
			for(int i = itemcount; i>0; i--) {
			array[i]=array[i-1];
			}
		array[0]=x;
		itemcount++;
	    }
		else 
			System.out.println("Array is full");
		
		
	}
	public int linearsearch(int x) {
		for(int i = 0; i<itemcount; i++) {
			if (array[i]== x)
				return i;
		}
		return -1;
					
		}
	public void delete(int x) {
		int pos = this.linearsearch(x);
		if (pos==-1) {
			System.out.println("Element not found.");
		}
		
		for(int i=pos; i<itemcount-1; i++) {
			array[i]=array[i+1];
		}
		itemcount--;
		
	}
	public void displayArray() {
		System.out.print("Array: ");
		for(int i=0;i<itemcount;i++) {
			System.out.print(array[i] +" ");
		}
		System.out.println();
	}
	
	

public static void main(String Args[]) {
	UnsortedArray arr = new UnsortedArray(20);
	arr.insertLast(8); 
	arr.insertLast(7); 
	arr.insertFirst(9);
	arr.displayArray();
	System.out.println("Count: " + arr.itemcount); 
	System.out.println("Position of 8: " + arr.linearsearch(8)); 
	System.out.println("Position of 5: " + arr.linearsearch(5)); 
	arr.delete(33); 
	arr.delete(3);
	System.out.println("Count: " + arr.itemcount);
	System.out.println("Hello world.");


}
}
