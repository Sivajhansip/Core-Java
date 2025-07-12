package Day5Loops;
//Find sum of digits in a number
public class Assignement5Day5Sumofdigitsofnumber {

	public static void main(String[] args) {
		int n=1234;
		int i;
		int sum=0;
		while(n!=0) {
			i=n%10;
			sum=sum+i;
			n=n/10;
		}
		System.out.println("Sum of digits in a number is : "+sum);

	}

}
