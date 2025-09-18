package Day16InterfaceAbstractClass;
interface Shape{
	static int length=10;
	static int width=20;
	
	void circle();//abstract method
	
	default void square() {//default method
		System.out.println("this is square - default method........");
	}
	static void rectangle() {
		System.out.println("this is rectangle - static method........");
	}
}
public class InterfaceDemo implements Shape{
    public void circle() {
    	System.out.println("this is circle - abstract method.....");
    }
    void triangle() {
    	System.out.println("this is triangle...");
    }
	public static void main(String[] args) {
		//scenario-1
		InterfaceDemo obj=new InterfaceDemo();
		obj.circle();//abstract
		obj.triangle();//class method
		obj.square();//default method
		//obj.rectangle();//cannot access
        Shape.rectangle();
        System.out.println(obj.length+obj.width);
        
		
		//Scenario-2
		Shape s=new InterfaceDemo();
		s.circle();
		s.square();
		//s.rectangle();//can't access
		Shape.rectangle();
		//s.triangle();//can't access
		

	}

}
