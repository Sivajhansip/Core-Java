package Day19ExceptionHandlingInJava;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exception occured, catch block handled ---> finally block will execute
		/*String s=null;
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e) {//by specifying Exception class in catch.
			System.out.println("Exception Handled....");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Entered finally block....");
		}*/
		//Exception occured, catch block NOT handled --> finally block will execute
		/*String s=null;
		try {
			System.out.println(s.length());
		}
		catch(ArithmeticException e) {//by specifying Exception class in catch.
			System.out.println("Exception Handled....");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Entered finally block....");
		}*/
		// Exception does not occured, catch block ignored ----> finally block will execute
		String st="welcome";
		try {
			System.out.println(st.length());
		}
		catch(ArithmeticException e) {//by specifying Exception class in catch.
			System.out.println("Exception Handled....");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Entered finally block....");
		}
	}

}
