package Day9Strings_2;

import java.util.Scanner;

public class Assignement4Day9CountWordsinaString {

	public static void main(String[] args) {
		//String s="Welcome to java selenium programming tutorial ";
		/*approach-1
		String a[]=s.split(" ");
		System.out.println(a.length);*/
		
		/*approach-2*/
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int count=1;
		String res="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
