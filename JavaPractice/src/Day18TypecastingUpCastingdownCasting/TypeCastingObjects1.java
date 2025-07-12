package Day18TypecastingUpCastingdownCasting;
class Parent{
	int id=10;
	void m1() {
		System.out.println("This is m1 method........");
	}
}
class Child extends Parent{
	String name="xxx";
	void m2() {
		System.out.println("This is m2 method........");
	}
}
public class TypeCastingObjects1 {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.name);
		c.m1();
		System.out.println(c.id);
		c.m2();
		
		System.out.println("...................Upcasting object.................");
		Parent p=new Child();//upcasting
		System.out.println(p.id);
		p.m1();
		//System.out.println(p.name);//we cannot access
		//p.m2();
		
		System.out.println(".....................Downcasting objet..................");
		Parent p1=new Parent();
		Child c1=(Child)p1;
		
		System.out.println(c1.name);
        System.out.println(c1.id);
        c1.m1();
        c1.m2();
	}

}
