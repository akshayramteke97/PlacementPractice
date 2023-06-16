
public class MinMax1 {
	public static void main(String[] args) {
		int[] arr= {3,5,4,1,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp;
					if(arr[i]>arr[j]) {
						temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
				}
		}
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println("minimum element is: "+arr[0]);
		System.out.println("maximum element is : "+arr[arr.length-1]);
	}
}
