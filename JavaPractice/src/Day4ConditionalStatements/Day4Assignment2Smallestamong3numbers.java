//smallest of 3 numbers(if..else)
package Day4ConditionalStatements;

public class Day4Assignment2Smallestamong3numbers {

	public static void main(String[] args) {
		int a=1,b=2,c=0;
		if(a<b && a<c) {
			System.out.println("Smallest number is a");
		}
		else if(b<a && b<c) {
			System.out.println("Smallest number is b");
		}
		else{
			System.out.println("Smallest number is c");
		}
		//Smallest number is c
	}

}
