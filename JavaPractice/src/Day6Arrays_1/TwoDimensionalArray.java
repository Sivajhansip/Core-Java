package Day6Arrays_1;
/*
1)Declare an array
2)Find the size of the array
3)Add values to array
4)Read single element from array
5)Read Multiple elements from array
*/
public class TwoDimensionalArray {

	public static void main(String[] args) {
		//Approach-1
		/*int a[][]=new int[3][2];// Declaration
		//Adding values
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		//Approach-2 Declartion+assignment
		int a[][]= { {100,200},
		             {300,400},
		             {500,600}
		            };
		
		//3.Find size of array
		System.out.println(a.length);//returns number of rows
		System.out.println(a[0].length);//returns number of columns in specfic row
		
		
		//4)Read single element from array
		System.out.println(a[1][1]);//400
		
	   //Read Multiple elements from array
	   for(int i=0;i<a.length;i++) {
		   for(int j=0;j<a[i].length;j++) {
			   System.out.println(a[i][j]);
		   }
	   }
	   
	   //Enhanced for loops
	   for(int arr[]:a) { //first iteration(FI) arr=[100,200],SI arr=[300,400] TI arr=[500,600]
		   for(int i:arr) {//Each value from arr is assigned individually to i and value get printed in console sequentially
			   System.out.println(i);
			   
		   }
		   System.out.println();
	   }
	}
}

	


