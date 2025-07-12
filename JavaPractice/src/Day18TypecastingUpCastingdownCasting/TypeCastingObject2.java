package Day18TypecastingUpCastingdownCasting;
class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}
public class TypeCastingObject2 {

	public static void main(String[] args) {
		//Rule-1:Conversion is valid or not
		//A b=(C) d;
		//The type d and c must have relationship(either parent to child or child to parent
		
		/*Animal an=new Dog();
		Cat c=(Cat) an;//valid as per rule-1
		*/
		
		/*Dog dg=new Dog();
		Cat c=(Cat) dg;//invalid as per rule-1*/
		
		//Rule-2 : Assignment is valid or not
		//'c' must be same or child of 'A'
		
		/*Animal an=new Dog();
		Cat ct=(Cat) an;//Valid as per rule2*/
		
		/*Animal an=new Dog();
		Cat ct=(Dog) an;//invalid as per rule2*/
		
		//Rule-3 The underlying object type of'd' must be either same or child of 'C'
		//will give run time error
		/*Animal an=new Dog();//Dog is underlying object
		Cat ct=(Cat) an;//Invalid as per rule-3*/
		
		//Rule1,Rule2,Rule3
		Animal an =new Dog();
		Dog d=(Dog) an;//Rule-1(yes) ,Rule-2(yes),Rule-3(yes)

	}

}
