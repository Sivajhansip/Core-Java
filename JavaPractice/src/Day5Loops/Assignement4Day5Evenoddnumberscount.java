package Day5Loops;
//count Number of Even and Odd digits in a Number
public class Assignement4Day5Evenoddnumberscount {

	public static void main(String[] args) {
		int n=1234567;
		int even_count=0;
		int odd_count=0;
		int i=0;
		while(n!=0) {
			i=n%10;
			n=n/10;
			if(i%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
		}
		System.out.println("Even count : "+even_count);
		System.out.println("Odd count :"+odd_count);

	}

}
