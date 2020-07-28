import java.util.Arrays;
public class SelectionSort{
	public static void main(String[] args) {
		int[]arr={3,4,-1,29,-5};
		System.out.println(Arrays.toString(myArr(arr)));
	
	}
	public static int[]myArr(int[]arr){
		int i=0;
		int j=0;
		int zeroIndex=i-1;
		for (j=zeroIndex+j;j<arr.length ;j++ ) {
				zeroIndex=j+1;
			if (arr[zeroIndex]>arr[j]) {
				int temp=arr[zeroIndex];
				arr[zeroIndex]=arr[j];
				arr[j]=temp;
				
			}
			

		}
		return arr;




	}
}