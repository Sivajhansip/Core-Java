package Day12PolymorphismMethodOverloadingConstructerOverloading;

public class OverloadMainMethod {

	void main(int a) {
		System.out.println(a);
	}
	
	void main(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		OverloadMainMethod ov=new OverloadMainMethod();
		ov.main(1);//1
		ov.main(1,1);//2

	}

}
