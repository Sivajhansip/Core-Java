package Day15OverridingKeywordsSuperFinal;
final class Test1{
	final void m1() {
		System.out.println("This is m1 method");
	}
}
/*class Test2 extends Test1{//final class will not be extended
	/*void m1() {//final method will not be overrided
		System.out.println("This is m2 method");
	}
}*/
public class FinalKeywordMethodClass {

	public static void main(String[] args) {
		/*Test2 t=new Test2();
		t.m1();*/
		Test1 t=new Test1();
		t.m1();

	}

}
