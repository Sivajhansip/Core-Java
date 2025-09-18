package Day3Operators;

public class IncrementOperator {
	public static void main(String args[]) {
		int a=10;
		//a=a+1;
		//a++;
		//System.out.println(a);//11
		
		
		//when we are storing value in variable then the initialization is done first and then increment is done so the value res is 10
		//normally a++,++a  works similar if it is not assigned to any varaible.
		
		//post increment
		int res=a++;
		System.out.println(res);//10
		System.out.println(a);//11
		
		/*//pre increment
		int res1=++a;
		System.out.println(res1);//11*/
		
	}

}
