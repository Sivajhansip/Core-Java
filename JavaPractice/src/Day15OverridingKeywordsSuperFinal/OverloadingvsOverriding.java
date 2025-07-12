package Day15OverridingKeywordsSuperFinal;
class ABC{
	void m1(int a) {
		System.out.println(a);
	}
	void m2(int b) {
		System.out.println(b);
	}
}
class XYZ extends ABC{
	void m1(int a){//overriding
		System.out.println(a*a);
	}
	
	void m2(int b) {//overriding
		System.out.println(b*b);
	}
	
	void m2(int a,int b) {//overloading
		System.out.println(a+b);
	}
}
public class OverloadingvsOverriding {

	public static void main(String[] args) {
		XYZ x=new XYZ();
		x.m1(10);//100
		x.m2(5);//25
		x.m2(1,2);//3

	}

}
