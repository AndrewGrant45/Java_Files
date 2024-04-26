package sorting_algorithms;
public class InsertionSort {
	public static void insertionSort(int[] arr) {
		for (int x = 1; x < arr.length; x++) { //variable x = 1 which is the starting index, and this loop will continue to run 
			//as log as x is less than the length of the arr
			int current = arr[x];
			int y = x-1;
			while(y>= 0 && current < arr[y]){ 
			// while loop compares the current element with the elements before it, shifting 
				//them one position to the right as long as the current element is smaller.
				//The loop continues as long as y is greater than or equal to 0(ensuring we don't go out of bounds)
				//and the current element is smaller than the element at index y.
				arr[y+1] = arr[y]; 
				y--;
			}
			arr[y+1] = current;
		}
	}
	public static void main(String a[]) {
		int[] arr1 = {3,5,7,8,4,2,1,9,6};
		System.out.println("Before Sorting");
		for(int x:arr1){
			System.out.print(x+" ");
			}
		System.out.println();
		insertionSort(arr1);//sorting array using insertion sort
		System.out.println("After Insertion Sorting");
		for(int x:arr1){
			System.out.print(x+" ");
		}
	}
	
}
