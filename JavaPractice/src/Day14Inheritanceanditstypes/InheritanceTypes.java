package Day14Inheritanceanditstypes;

//single,multilevel inheritance
class A{
	int a;
	void display() {
		System.out.println(a);
	}
	
}

class B extends A{
	int b;
	void show() {
		System.out.println(b);
	}
}
class C extends B{
	int c;
	void print() {
		System.out.println(c);
	}
}
public class InheritanceTypes {

	public static void main(String[] args) {
		/*B bobj=new B();
		bobj.a=1;
		bobj.b=2;
		bobj.display();
		bobj.show();*/
		
		C cobj=new C();
		cobj.a=1;
		cobj.b=2;
		cobj.c=3;
		cobj.display();
		cobj.show();
		cobj.print();
		

	}

}
