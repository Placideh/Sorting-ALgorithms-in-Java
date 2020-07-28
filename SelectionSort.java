import java.util.Arrays;
public class SelectionSort{
	public static void main(String[] args) {
		int[]arr={3,4,-1,29,-5};
		System.out.println(Arrays.toString(myArr(arr)));
	
	}
	public static int[]myArr(int[]arr){
		// int j=0;
		for (int k=0;k<arr.length ;k++ ) {
		int i=0;
		int minPos=i;
		int j=0;
		for (j=minPos+j;j<arr.length-1 ;j++ ) {
			minPos=j+1;
			if (arr[j]>arr[j+1]) {
				int temp=arr[minPos];
				arr[minPos]=arr[j];
				arr[j]=temp;
				
			}

		}
		}
		return arr;

	}
}
/*ACTUALLY THIS SELECTION I HAVE IMPLEMENTED BY MYSELF AND IT IS NOT THAT MUCH 
SCARY BUT IT TAKES ME LIKE 2 HOURS BUT FINALLY I HAVE COME TO FIGURE OUT SO 
THIS IS PROGRAMMING YOU HAVE TO KEEP TRYING TILL THE THINGS TURN TO BE GOOD*/