
public class MinMax2 {
	public static void main(String[] args) {
		int[] arr= {3,5,4,1,9};
		int min=0;
		int max=0;
		if(arr[0]<arr[1]) {
			min=arr[0];
			max=arr[1];
		}else {
			min=arr[1];
			max=arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}else if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("minimum value is : "+min);
		System.out.println("maximum value is : "+max);
	}
}
