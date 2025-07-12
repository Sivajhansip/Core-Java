package Day7Arrays_2DynamicInputalso;
/*Find Missing in Number in array
*numbers should be in range
*should not have duplicates
*no need of sorting order
*logic:  1+2+4+5=12 (sum1)
        1+2+3+4+5=15 (sum2)
        sum2-sum1 = missing number
*/

public class Assignment2Day7FindMissinginNumberinarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7};
        int sum1=0;	
        int sum2=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elements in array : "+sum1);

		for(int j=1;j<=7;j++) {
			sum2=sum2+j;
		}
		System.out.println("Sum of range of elements : "+sum2);
		System.out.println("Missing number in array is : "+(sum2-sum1));
	}

}
