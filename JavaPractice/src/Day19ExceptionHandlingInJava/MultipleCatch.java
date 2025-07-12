package Day19ExceptionHandlingInJava;

public class MultipleCatch {

	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println(s.length());
		}
		/*catch(Exception e) {//by specifying Exception class in catch.
			System.out.println("Exception Handled");
			System.out.println(e.getMessage());
		}*/
		//By creating multiple catch blocks
		catch(ArithmeticException e) {
			System.out.println("Arthematic Exception Handled......");
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception Handled....");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormat Exception Handled....");
		}
   	    

	}

}
