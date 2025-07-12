package Day19ExceptionHandlingInJava;

import java.util.Scanner;

public class ExceptionsDemo {
     public static void main(String args[]) {
    	 System.out.println("Program Started.........");
    	 Scanner sc=new Scanner(System.in);
    	 //Example-1
    	 /*
    	 System.out.println("Enter a number : ");
    	 int num=sc.nextInt();
    	 System.out.println(100/num);//ArithmeticException*/
    	 
    	 //Example-2
    	 /*int a[]=new int[5];
    	 System.out.println("Enter position[0-4] : ");
    	 int pos=sc.nextInt();
    	 System.out.println("Enter a number : ");
    	 int num=sc.nextInt();
    	 a[pos]=num;//ArrayIndexOutOfBoundsException
    	 System.out.println(a[pos]);*/
    	 
    	 //Example-3
    	 /*String s="Java";
    	 int num=Integer.parseInt(s);//NumberFormatException
    	 System.out.println(num);*/
    	 
    	 //Example-4
    	 String s=null;
    	 System.out.println(s.length());//NullPointerException
    	 
    	 System.out.println("Program ended.........");
     }

}
