package Day6Arrays_1;

import java.util.Arrays;

/*
 1)Declare an array
 2)Find the size of the array
 3)Add values to array
 4)Read single element from array
 5)Read Multiple elements from array
 */

public class SingleDimentionalArray {

	public static void main(String[] args) {
		//Approach-1
		/*int a[]=new int[5];//Declaration
		//Adding values into array
		a[0]=1;
		a[1]=1;
		a[2]=1;
		a[3]=1;
		a[4]=1;*/
		//Approach-2//Declaration+assignment
		int a[]= {1,2,3,4,5};//Dynamic allaocation
		
		//3.Size of array
		System.out.println(a.length);
		
		//4.Reading single value from array
		System.out.println(a[2]);
		
		//5.Reading Multiple values from array 
		System.out.println(Arrays.toString(a));//It will just display the data
		//Normal for loop
		/*for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		//Enhanced for loop--Especially designed for array & collections to fetch multiple values
		for(int x:a) {
			System.out.println(x);
		}
			
		
		

	}

}
