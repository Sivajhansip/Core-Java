package Day16InterfaceAbstractClass;

abstract class Example{
	abstract void ex1();
	
	void ex2() {
		System.out.println("This is ex2 method - default method.....");
	}
	
}
public class AbstractionDemo extends Example {
	void ex1() {
		System.out.println("This is ex1 method - Abstarct method.....");
	}

	public static void main(String[] args) {
		AbstractionDemo a=new AbstractionDemo();
		a.ex1();
		a.ex2();

	}

}
