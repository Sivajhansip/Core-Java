package Day5Loops;
//Count Number of Digits in a Number (looping)
public class Assignment3Day5countofNumberofDigits {

	public static void main(String[] args) {
		int n=1234567;
		int i=0;
		while(n!=0) {
			i++;
			n=n/10;
			//System.out.println(n);
		}
		System.out.println("Number of digits in Given number is "+i);

	}

}
