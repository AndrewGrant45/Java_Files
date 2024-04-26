package advancedJavaCode;
public class MergeSortAlgorithm {
	public class MergeSort {
	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            int mid = (left + right) / 2;

	            mergeSort(arr, left, mid); // Sort left half
	            mergeSort(arr, mid + 1, right); // Sort right half

	            merge(arr, left, mid, right); // Merge the sorted halves
	        }
	    }

	    public static void merge(int[] arr, int left, int mid, int right) {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        int[] leftArr = new int[n1];
	        int[] rightArr = new int[n2];

	        for (int i = 0; i < n1; ++i) {
	            leftArr[i] = arr[left + i]; // Copy elements to left array
	        }
	        for (int j = 0; j < n2; ++j) {
	            rightArr[j] = arr[mid + 1 + j]; // Copy elements to right array
	        }

	        int i = 0, j = 0, k = left;

	        while (i < n1 && j < n2) {
	            if (leftArr[i] <= rightArr[j]) {
	                arr[k] = leftArr[i]; // Merge smaller element from left array
	                i++;
	            } else {
	                arr[k] = rightArr[j]; // Merge smaller element from right array
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	            arr[k] = leftArr[i]; // Copy remaining elements from left array
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            arr[k] = rightArr[j]; // Copy remaining elements from right array
	            j++;
	            k++;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {9, 2, 5, 1, 8, 4, 6};
	        int n = arr.length;

	        mergeSort(arr, 0, n - 1);

	        System.out.println("Sorted Array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}

}
