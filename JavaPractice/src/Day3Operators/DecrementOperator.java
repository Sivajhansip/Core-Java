package Day3Operators;

public class DecrementOperator {

	public static void main(String[] args) {
		/*int a=100;
		a=a-1;
		System.out.println(a);*///99
		
		//In pre/post increment/decrement first the value is initialized and increment/decrement will be done 
		
		//post decrement
		/*int a=100;
		int res=a--;
		System.out.println(res);//100*/
		
		
		//pre decrement
		int a=100;
		int res=--a;
		System.out.println(res);//99
		int res1=res--;//res1=99
		System.out.println(res);//98
		int res2=--res;//res2=97
		System.out.println(res);//97
		System.out.println(res1);//99
		System.out.println(res2);//97

	}

}
