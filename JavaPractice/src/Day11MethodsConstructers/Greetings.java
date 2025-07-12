package Day11MethodsConstructers;

public class Greetings {
    //1)no return,no paramters
	void m1() {
		System.out.println("Hello");
	}
	
	//2) return,no paramters
    String m2() {
    	return("Hi,How are you?");
    }
    //3)Takes parameter no return
    
    void m3(String name) {
    	System.out.println("Hello "+name);
    }
    	
    //4)takes parameter,return value
    String m4(String name) {
    	return("Hi "+name);
    }
}
