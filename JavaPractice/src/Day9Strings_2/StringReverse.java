package Day9Strings_2;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		/*//Method-1--length(),chaAt()
		
		String s="Selenium";
		String Reverse_String = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			Reverse_String=Reverse_String+s.charAt(i);
		}
		    System.out.println(Reverse_String);
        */
		
		/*//Method-2 --Converting string to char array
		
		//String s="Welcome";
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String Reverse_String = "";
		char a[]=s.toCharArray();//this will convert string to char array
		//System.out.println(Arrays.toString(a));//[W, e, l, c, o, m, e]
		
		for(int i=a.length-1;i>=0;i--)
		{
			Reverse_String=Reverse_String+a[i];
		}
		System.out.println(Reverse_String);*/
		
		//Method 3--string buffer
		StringBuffer s=new StringBuffer("Welcome");
		System.out.println(s.reverse());
		
		//Method-4--using string builder
		StringBuilder s1=new StringBuilder("Welcome");
		System.out.println(s1.reverse());
		
		
		
	}

}
