package Day6Arrays_1;
public class ArrayDemo_RA {

	public static void main(String[] args) {
		// Array--container which stores multiple values of same datatype
		int arr[]=new int[5];//declaring an array and allocating memory to values
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		//int b[]= {1,2,3,4,5,6};//dynamic allocation of array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
