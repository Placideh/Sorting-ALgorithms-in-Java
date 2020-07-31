public class MergeSort{
	public static void main(String[] args) {
		int[]arr={3,-1,4,2};
		mergeSort(arr,0,arr.length-1);
		for (int elm :arr ) {
			System.out.print(elm+" ");
			
		}
	}
	public static void mergeSort(int[]arr,int left,int right){
		if (left<right) {

			int middle=(left+right)/2;
			mergeSort(arr,left,middle);
			mergeSort(arr,middle+1,right);
			merge(arr,left,right,middle);
		}
		

			
				
	}
	public static void merge(int[]arr,int left,int right,int middle){
		//creating size of left array
		int leftSize=middle-left+1;
		int rightSize=right-middle;
		//creating the arrayof Each side
		int[]leftArr=new int[leftSize];
		int[]rightArr=new int[rightSize];
		//inserting elements of the both arrays
		for (int i=0;i<leftSize;i++ ) {
			leftArr[i]=arr[left+i];
			
		}
		for (int j=0;j<rightSize;j++ ) {
			rightArr[j]=arr[middle+1+j];
			
		}
		int i=0;
		int j=0;
		int k=left;
		//start merging 
		while (i<leftSize&&j<rightSize) {
			if (leftArr[i]<=rightArr[j]) {
				arr[k]=leftArr[i];
				i++;

			}else{
				arr[k]=rightArr[j];
				j++;
			}
			k++;
			
		}
		while (i<leftSize) {
			arr[k]=leftArr[i];
			i++;
			k++;

			
		}
		while (j<rightSize) {
			arr[k]=rightArr[j];
			j++;
			k++;

			
		}
	}
}