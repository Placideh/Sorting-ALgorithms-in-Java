import java.util.Arrays;
public class BubbleSort{
	/* there is another way to implement this but I am like kind tired
	I will do it by tommorow*/
	public static int[]myarr(int[]names) {
		// this sorting tech now I will be using enhanced for loop
		for (int i=0;i<names.length-1 ;i++ ) {
			for (int j=0;j<names.length-1 ;j++ ) {
				if (names[j]>names[j+1]) {
					int  temp=names[j];
					names[j]=names[j+1];
					names[j+1]=temp;

					
				}
			}
		}
		return names;
	}
	public static void main(String[] args) {
		int [] names={3,7,20,5,-2};
		System.out.println(Arrays.toString(myarr(names)));
		/*This ways works like the above line the things is that we don't need to use Array Class
		but as a programmer we have to use less code so I prefer the above mthod
		myarr(names);
		for (int i :names ) {
			System.out.print(i+" ");
			
		}
		*/

		
	}
}