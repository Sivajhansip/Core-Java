package Day12PolymorphismMethodOverloadingConstructerOverloading;
//Call by reference---passing object to method it will impact original value
public class CallbyReference {

	public static void main(String[] args) {
		Test test=new Test();
		test.number=100;
		System.out.println("Value of number before passing object to method :"+test.number);
		test.m2(test);
		System.out.println("Value of number after passing object to method :"+test.number);

	}

}
