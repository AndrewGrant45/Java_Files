package sorting_algorithms;
public class SelectionSort {
	public static void selectionSort(int[] arr){
		for (int x = 0; x < arr.length - 1; x++){ // runs code as long as x is less than arr.length-1
			int indx = x;
			for (int y = x + 1; y < arr.length; y++){ //y is always greater then x, meaning that y will always be the next number 
				if (arr[y] < arr[indx]){//if the value of the y is less then the array index, then it will swap
					indx = y;
			}
		}
		int smallNumber = arr[indx];
		arr[indx] = arr[x];
		arr[x] = smallNumber;
			}
	}
		// just printing each line of the array 
		public static void main(String a[]){
			int[] arr1 = {3,5,1,2,4};
			System.out.println("Before Sorting");
			for(int x:arr1){
				System.out.print(x+" ");
		}
			System.out.println();
			selectionSort(arr1);
			System.out.println("After Selection Sorting");
			for(int x:arr1){
				System.out.print(x+" ");
			}
	}
}
