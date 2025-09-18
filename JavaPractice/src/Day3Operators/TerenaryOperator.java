package Day3Operators;

public class TerenaryOperator {

	public static void main(String[] args) {
		//var=Exp?res1:res2
		//ex:1
		int a=10;
		int b=20;
		int res=a<b?a:b;
		System.out.println(res);//10
		
		//ex:2
		int age=18;
		String res1=(age>=18)?"Eligible":"Not eligible";
		System.out.println(res1);//Eligible
		
		//ex:3
		int x=(1==1)?100:200;
		System.out.println(x);//100
		
		//ex:4
		String y=(1!=1)?"True":"False";
		System.out.println(y);

	}

}
