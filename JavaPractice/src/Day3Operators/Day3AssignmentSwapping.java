package Day3Operators;
//1) swapping of 2 numbers
public class Day3AssignmentSwapping {

	public static void main(String[] args) {
		
		//logic -1 using temp variable
		int a=10,b=20,t;
		t=a;
		a=b;
		b=t;
		System.out.println("After swapping a: "+a+" ,"+"b: "+b);
		
		//logic -2 using +,-operators
		int a1=10,b1=20;
		a1=a1+b1;
		b1=a1-b1;
		a1=a1-b1;
		System.out.println("After swapping a1: "+a1+" ,"+"b1: "+b1);
		
		//logic -3 using *,/operators--this is applicable only when there is no zero in values
		int a2=10,b2=20;
		a2=a2*b2;
		b2=a2/b2;
		a2=a2/b2;
		System.out.println("After swapping a2: "+a2+" ,"+"b2: "+b2);
		
		//logic-4 using Exor--^--if both the numbers are same output 0 otherwise 1
		int a3=10,b3=20;
		a3=a3^b3;
		b3=a3^b3;
		a3=a3^b3;
		System.out.println("After swapping a3: "+a3+" ,"+"b3: "+b3);
		
		//logic-5 single statement
		int a4=10,b4=20;
		b4=(a4+b4)-(a4=b4);/*(10+20)-(10)=(30-10)=20//b4=10,a4=20*/
		System.out.println("After swapping a4: "+a4+" ,"+"b4: "+b4);
		
		
	}

}
