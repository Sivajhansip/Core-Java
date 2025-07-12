package Day15OverridingKeywordsSuperFinal;

public class Animal {
	String colour="White";
	void eat() {
		System.out.println("Eating......");
	}
	Animal(){
		System.out.println("This is animal");
	}
	Animal(String name){
		System.out.println(name);
	}
}
class Dog extends Animal{
	String name="Black";
	void display_colour() {
		System.out.println(super.colour);
	}
	void eat() {
		super.eat();
		System.out.println("eating bread...");
	}
	Dog(){
		System.out.println("This is dog");
	}
	Dog(String name){
		super(name);
	}
}
	

