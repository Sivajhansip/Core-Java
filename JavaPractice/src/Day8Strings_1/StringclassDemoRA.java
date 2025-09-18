package Day8Strings_1;
public class StringclassDemoRA {

	public static void main(String[] args) {
		/*String is prebuilt class in java java creates an object to use the string
		 methods to declare a string:
		 1. using string literal
		 2. using creation of object for string 
		 The main difference is like,
		 we create string using literal then for ex:
		 String a="HI"
		 String b="HI" Java doesn't creates two objects for the mentioned strings it will checks whether the strings are same
		 The object created to 'a' variable is used by 'b' variable also
		 By creating object of string:
		 ex: String a =new String("HI");
		 String b =new String("HI");
		 For method 2 two seperate objects are created*/
		//String a="HELLO";//using literal
		//String a =new String("Hello");//using object
		String a="Hello World! ";
		System.out.println(a.charAt(1));//e
		System.out.println(a.indexOf("o"));//4
        System.out.println(a.substring(0, 5));//Hello
        System.out.println(a.substring(6));//World!
        System.out.println(a.concat("1"));//Hello World! 1
        System.out.println(a.trim());//Hello World!
        System.out.println(a.toUpperCase());//HELLO WORLD!
        System.out.println(a.toLowerCase());//hello world!
        //split
        String arr[]=a.split(" ");
        System.out.println(arr[0]);//Hello
        System.out.println(arr[1]);//World
        
	}

}
