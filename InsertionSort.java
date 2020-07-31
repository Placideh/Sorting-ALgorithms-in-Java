import java.util.Arrays;
public class InsertionSort{
	public static void main(String[] args) {
	int[] arr={5,2,-1,3};
	System.out.println(Arrays.toString(myArr(arr)));

	}
	public static int[] myArr(int[]arr){
		for (int i=1;i<arr.length ;i++ ) {
			
		
			int j=i-1;
			int key=arr[i];
			while (j>=0&&key<arr[j]) {
				arr[j+1]=arr[j];
				j=j-1;

				
			}
			arr[j+1]=key;
		}
		return  arr;
	
	}
	
}