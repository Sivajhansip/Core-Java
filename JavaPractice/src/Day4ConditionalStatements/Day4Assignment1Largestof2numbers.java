//Largest of 2 numbers using terenary&if else statements
package Day4ConditionalStatements;

public class Day4Assignment1Largestof2numbers {

	public static void main(String[] args) {
		int a=10,b=20;
		char res=(a>b)?'a':'b';
		System.out.println("Largest number is "+res);//b
        if(a>b) {
        	System.out.println("largest number is a");
        }
        else {
        	System.out.println("largest number is b");//b
        }
	}

}
