package Day7Arrays_2DynamicInputalso;
//Taking multiple inputs
import java.util.Scanner;

public class TakingMultipleInputs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Approach-1
		/*System.out.println("Enter first number : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second number : ");
		int num2=sc.nextInt();
		
		System.out.println("Sum of two numbers : "+(num1+num2));*/
		
		//Approach-2
		int sum=0;
		for(int i=0;i<=2;i++) {
			System.out.println("Enter a number : ");
			int a=sc.nextInt();
			sum=sum+a;
		}
       System.out.println("Sum of numbers : "+sum);
	}

}
