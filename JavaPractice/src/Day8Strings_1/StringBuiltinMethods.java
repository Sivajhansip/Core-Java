package Day8Strings_1;

import java.util.Arrays;

public class StringBuiltinMethods {

	public static void main(String[] args) {
		//String s="Alice";
		String st=new String("Alice");
		System.out.println(st);
		
		System.out.println("----------------length()----------------------------");
		//Length --returns length of string
		String s="Jhansi";
		System.out.println(s.length());
		
		System.out.println("-----------------concat()--------------------------");
		//concate -- join strings
		String s1="Hello ";
		String s2="World!";
		String s3="2";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		//more than 2 strings
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		System.out.println("welcome "+"to java");
		System.out.println("Welcome ".concat("to java"));
		
		System.out.println("---------------------trim()-----------------------------");
		//trim -- remove spaces in right/left side
		s="  welcome   ";
		System.out.println("Before triming : "+s.length());//12
		s1=s.trim();
		System.out.println("after triming : "+s1.length());//7
		
	   System.out.println("---------------------charAt()-------------------------");
       //charAt()--returns a character based on index(index starts from 0)
	   s="welcome";
	   System.out.println(s.charAt(4));//o
	   System.out.println(s.charAt(5));//m
	   
	   System.out.println("--------------------contains()------------------------");
	   //contains() --checks a string is part of main string or not.
	   //Returns a boolean value(true/false)
	   System.out.println(s.contains("wel"));//true
	   System.out.println(s.contains("Come"));//false
	   System.out.println(s.contains("come"));//true
	   
	   //It will checks for subset of string in sequence
	   System.out.println(s.contains("welome"));//false
	   
	  System.out.println("----------------equals(),equalsIgnoreCase()-------------------");
	  //equals()(case sensitive),equalsIgnoreCase()(Ignores casesensitivity)--compare 2 strings
	  //returns true/false
	  s1="welcome";
	  s2="welCome";
	  System.out.println(s1.equals(s2));//false
	  System.out.println(s1.equals("welcome"));//true
	  System.out.println(s1.equalsIgnoreCase(s2));//true
	  System.out.println(s1.equalsIgnoreCase("welcome"));//true
	  
	  System.out.println("--------------------Replace()------------------------");
	  //replace ---Replace the single character/sequence of characters in string
	  s="Welcome to selenium automation using java python c# Java";
	  System.out.println(s.replace('e', 'x'));//Wxlcomx to sxlxnium automation using java python c# Java
	  System.out.println(s.replace("Java", "."));//Welcome to selenium automation using java python c# .
	  
	  System.out.println("-------------------replaceAll()-------------------------------");
	  String sp="wel&&^^%%*())*come";
      System.out.println(sp.replaceAll("[^a-zA-Z0-9]", ""));//welcome
	  System.out.println("----------------------------substring()--------------------------------");
	  //substring ---extract substring from main string
	  s="welcome";
	  
	  System.out.println(s.substring(1,3));
	  System.out.println(s.substring(0,5));
	  
	  System.out.println("-----------------toUpperCase(),toLowerCase()-----------------------------------");
	  //toUpperCase(),toLowerCase()--converts the case
	  System.out.println(s.toUpperCase());//WELCOME
	  System.out.println(s.toLowerCase());//welcome
	  
	  System.out.println("---------------------------split()---------------------------------------------");
	  //spilt() --splits ths string based on delimeter
	  /*//ex:1
	  s="abc@xyz";
	  
	  String a[]=s.split("@");
	  System.out.println(a[0]);//abc
	  System.out.println(a[1]);//xyz*/
	  
	  /*//Ex-2
	  s="abc@gmail.com";
	  String a[]=s.split("@");
	  System.out.println(a[0]);//abc
	  System.out.println(a[1]);//gmail.com*/
	  
	  /*//Ex-3
	  String amount="$15,20,30,40";
      System.out.println(amount.replace("$", "").replace(",", ""));//15203040*/
	  
	  //Ex-4
	  //way-1
	  /*s="abc,123@xyz";
	  String a1[]=s.split(",");//abc 123@xyz
	  System.out.println(a1[0]);//abc
	  System.out.println(a1[1]);//123@xyz
	  
	  String a2[]=a1[1].split("@");//123@xyz
	  System.out.println(a2[0]);//123
	  System.out.println(a2[1]);//xyz*/
	  
	  //way-2
	  s="abc,123@xyz";
	  
	  String firststring=s.split(",")[0];//abc
	  String secondstring=s.split(",")[1].split("@")[0];//123
	  String thirdstring=s.split(",")[1].split("@")[1];//xyz
	  
	  System.out.println(firststring);
	  System.out.println(secondstring);
	  System.out.println(thirdstring);
	  
	  //Ex:5
	  s="abc def ghi";
	  String a1[]=s.split(" ");
	  //System.out.println(s.split(" ")[0]);
	  //System.out.println(s.split(" ")[1]);
	  //System.out.println(s.split(" ")[2]);
	  
	  System.out.println(Arrays.toString(a1));//[abc, def, ghi]
	  
	  //*,%,+,^,&,()--not use as delimeter
	  
	  System.out.println("------------problems-------------------");
	  //problem
	  s="Jhansi";
	  System.out.println(s.contains("jhansi"));//false
	  System.out.println(s.toLowerCase().contains("jhansi"));//true
	  System.out.println(s.replace("J", "j").contains("jhansi"));//true
	}
}
