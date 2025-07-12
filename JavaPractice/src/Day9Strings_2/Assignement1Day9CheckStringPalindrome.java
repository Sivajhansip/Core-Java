package Day9Strings_2;

import java.util.Scanner;

/*
Check String is palindrome or not

String s= "MADAM"
 Output: palindrom
String s="Welcome"
	output: Not palindrom
*/
public class Assignement1Day9CheckStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String original=s;
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(original.equals(rev)){
			System.out.println("Palidrome string");
		}
		else {
			System.out.println("Not a palindrome string");
		}

	}

}
