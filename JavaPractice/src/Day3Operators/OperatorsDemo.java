package Day3Operators;

public class OperatorsDemo {

	public static void main(String[] args) {
		//Arithematic operators + - * / %
		int a=30,b=10;
		System.out.println("Sum of a + b : "+(a+b));//40
		System.out.println("Difference of a - b : "+(a-b));//20
		System.out.println("Mul of a * b : "+(a*b));//300
		System.out.println("Div of a / b : "+(a/b));//3
		System.out.println("Modulo division of a % b : "+(a%b));//0
		
		// Relational/Comparision operators > < >= <= != ==
		//Returns a boolean value
		System.out.println(a > b);//true
		System.out.println(a < b);//false
		System.out.println(a >= b);//true
		System.out.println(a <= b);//false
		System.out.println(a != b);//true
		System.out.println(a == b);//false
		
		//Logical operators && || !
		//Logical operators will be used with boolean value and used to compare multiple values
		//returns boolean value
		System.out.println("-----------Boolean operators------------------------");
		boolean x=true;
		boolean y= false;
		System.out.println(x&&y);//false
		System.out.println(x||y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		boolean b1=a>b;
		System.out.println(b1);//true
		
		boolean b2=10<20;
		System.out.println(b2);//true
		
		System.out.println(b1&&b2);//true
		System.out.println(b1||b2);//true
		
		System.out.println(10<20 && 30>5);//true
		System.out.println(10<20 || 30>5);//true
		System.out.println(!(10<20));//false
		
		
	}

}
