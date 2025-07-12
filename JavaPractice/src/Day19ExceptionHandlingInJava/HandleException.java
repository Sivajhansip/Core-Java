package Day19ExceptionHandlingInJava;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		 System.out.println("Program Started.........");
		
   	     Scanner sc=new Scanner(System.in);
   	     //example-1
	   	 /*System.out.println("Enter a number : ");
	   	 int num=sc.nextInt();
	   	 try {
	   	 System.out.println(100/num);
	   	 }
	   	 catch(ArithmeticException e) {
	   		 System.out.println("Invalid number entered");
	   		 System.out.println(e.getMessage());
	   	 }*/
	   	 
   	     //example-2
   	     
	   	 int a[]=new int[5];
	 	 System.out.println("Enter position[0-4] : ");
	 	 int pos=sc.nextInt();
	 	 System.out.println("Enter a number : ");
	 	 int num=sc.nextInt();
	 	 try {
	 	 a[pos]=num;//ArrayIndexOutOfBoundsException
	 	 System.out.println(a[pos]);
	 	 }
	 	 catch(ArrayIndexOutOfBoundsException e) {
	 		 System.out.println("Enter valid position number");
	 		 System.out.println(e.getMessage());
	 	 }
	   	 System.out.println("Program ended........");

	}

}
