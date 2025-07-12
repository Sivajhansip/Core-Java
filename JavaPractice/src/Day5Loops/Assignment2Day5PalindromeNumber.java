package Day5Loops;
//Palindrome number ( conditional statements + looping)
public class Assignment2Day5PalindromeNumber {

	public static void main(String[] args) {
		int i=141;
		int rev=0;
		int n=i;
		while(i!=0)
		{
			rev=rev*10+i%10;
			i=i/10;
		}
        if(rev==n) {
        	System.out.println("Palindrome number");
        }
        else {
        	System.out.println("Not a palindrome number");
        }
	}

}
