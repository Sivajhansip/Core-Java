package Day12PolymorphismMethodOverloadingConstructerOverloading;
//Call by value--just passing copy of varaible it will not impact original value
public class CallbyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		int number=10;
		System.out.println("Before passing to method number value is : "+number);
		test.m1(number);//Call by value
	    System.out.println("After passing to method number value is : "+number);

	}

}
