package Day16InterfaceAbstractClass;

public class MultipleInheritance implements Interfacei1,Interfacei2{
	public void m1() {
		System.out.println("This is m1..........");
	}
	public void m2() {
		System.out.println("This is m2..........");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance m=new MultipleInheritance();
		m.m1();
        m.m2();
        System.out.println(m.x+m.y);
	}

}
