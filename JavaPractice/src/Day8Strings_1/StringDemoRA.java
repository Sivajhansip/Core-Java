package Day8Strings_1;
public class StringDemoRA {

	public static void main(String[] args) {
		//Java strings are immutable because it will share same object if both the strings are same consider and example:
		String a="Hello";//String literal--immutable
		//String b="Hello";//only object is created for a string and that will be used
		a.concat("World");
		System.out.println(a);
		//the output will be hello only because b also referrig to same a object only so by defaultly the platform itself make java strings as immutable
		//one way to concatenate is
		String c=a.concat("world");
		System.out.println(c);
		//to make string mutable
		//To change original string itself java as provided two classes StringBuffer,StringBuilder--mutable
		StringBuffer sb=new StringBuffer("Hello");//StringBuffer--mutable
		sb.append("world");
		System.out.println(sb);
		sb.insert(1, 'e');
		System.out.println(sb);//Heelloworld
		sb.replace(1, 3, "aa");
		System.out.println(sb);//Haalloworld
		sb.deleteCharAt(1);
		System.out.println(sb);//Halloworld
		sb.reverse();
		System.out.println(sb);//dlrowollah
		
		/*
		 --StringBuffer is thread safe/synchronized 
		 --StringBuilder is not thread safe/non-synchronized
		 --For example in automation we are running parallel testcases and it is using same variable for all tests in this case stringbuffer will execute existing test first and other test(one by one) in this way it manages thread control
		 -- For stringbuffer it allows parallel cases to made changes at a time no synchronization is happens so it is not thread safe
		 -- StringBuilder works faster than string buffer because it is not thread safe
		 --For parallel testing we use string buffer for sequence testing we use string builder.
		 */
		
		/*Difference b/w == and equals()
		== - checks for object reference 
	    Equals - Checks for content */
		String i="Hello";
		String j="Hello";
		String k=new String("Hello");//String class creates every time new object
		String l=new String("Hello");
		System.out.println(i.equals(j));//true
		System.out.println(i==j);//true
		System.out.println(i.equals(k));//true
		System.out.println(i==k);//false
		System.out.println(k==l);//false
		System.out.println(k.equals(l));//true
	}

}
