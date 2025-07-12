package Day9Strings_2;

public class StringComparision {

	public static void main(String[] args) {
		
		/*//Case-1
		String s1="abc";
		String s2="abc";
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true*/
		
		/*//Case-2
		String s1=new String("welcome");
		String s2=new String("welcome");
		System.out.println(s1==s2);//false //== used for comparing objects
		System.out.println(s1.equals(s2));//true //equals() used for comparing values*/
		
		/*//Case-3 
		String s1="abc";
		String s2=new String("abc");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true*/
		
		//case-4
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s2==s3);//true //here objects are same
		System.out.println(s2.equals(s3));//true //here values of objects are same
		
		

	}

}
