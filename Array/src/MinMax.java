// Java program of above implementation
// Java program of above implementation
public class MinMax {
	static int[] getMinMax(int arr[], int n) {
		int i;
int max =0, min =0;
		/*If there is only one element then return it as min and max both*/
		if (n == 1) {
			max = arr[0];
			min = arr[0];
			return new int[]{max,min};
		}
 
		/* If there are more than one elements, then initialize min
	and max*/
		if (arr[0] > arr[1]) {
			max = arr[0];
			min = arr[1];
		} else {
			max = arr[1];
			min = arr[0];
		}
 
		for (i = 2; i < n; i++) {
			if (arr[i] > max) {
			max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
 
		return new int[]{max,min};
	}
 
	/* Driver program to test above function */
	public static void main(String args[]) {
		int arr[] = {1000, 11, 445, 1, 330, 3000};
		int arr_size = 6;
		int[] minmax = getMinMax(arr, arr_size);
		System.out.printf("\nMinimum element is %d", minmax[1]);
		System.out.printf("\nMaximum element is %d", minmax[0]);
 
	}
}
