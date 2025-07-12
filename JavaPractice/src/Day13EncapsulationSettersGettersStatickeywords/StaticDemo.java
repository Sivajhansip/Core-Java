package Day13EncapsulationSettersGettersStatickeywords;

public class StaticDemo {
    static int a=1;
    int b=2;
    
    static void m1() {
    	System.out.println("m1 is static method");
    }
    
    void m2() {
    	System.out.println("m2 is non-static method");
    }
    
    void m3() {
    	System.out.println(a);
    	System.out.println(b);
    	m1();
    	m2();
    }
	/*public static void main(String[] args) {
		System.out.println(a);
		m1();
		
		// we cannot access because b,m2() are non static variable & method
		//System.out.println(b);
		//m2();
		
		
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		sd.m3();

	}*/

}
