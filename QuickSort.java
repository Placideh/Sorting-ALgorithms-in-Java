public class QuickSort{
	public static void main(String[] args) {
		int[]arr={3,4,-1,2};
		myArr(arr,0,arr.length-1);
		for (int elm :arr ) {
			System.out.print(elm+" ");
			
		}

	}
	public static void myArr(int[]arr,int left,int right){
		if (left>=right) {
			return;
			
			
		}
		int pivot=arr[(left+right)/2];
		int index=partition(left,right,arr,pivot);
		myArr(arr,left,index-1);
		myArr(arr,index,right);



	}
	public static int partition(int left,int right,int[]arr,int pivot){
		// pivot=arr[(left+right)/2];
		while(left<=right){

		while (arr[left]<pivot) {
			left++;
			
			
		}
		while(arr[right]>pivot){
			right--;
		}
		if (left<=right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
			
		}
		}
		return left;
	}
}