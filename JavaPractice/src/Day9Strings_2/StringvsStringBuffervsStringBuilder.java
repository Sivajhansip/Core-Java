package Day9Strings_2;

public class StringvsStringBuffervsStringBuilder {
	public static void main(String[] args) {
		
		//String--immutable -cannot change
		
		/*String s="Welcome";
		s.concat("to java");
		System.out.println(s);//Welcome*/
		
		/*//StringBuffer --Mutable --can change
		StringBuffer s=new StringBuffer("welcome ");
		s.append("to java");
		System.out.println(s);//welcome to java*/
		
		//StringBuilder --Mutable --can change
		StringBuilder s=new StringBuilder("welcome ");
		s.append("to java");
		System.out.println(s);//welcome to java
	}

}
