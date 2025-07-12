package Day18TypecastingUpCastingdownCasting;

//Upcasting -converting value from smaller -->Larger
//int--long
//float--double

//Downcasting-converting value from larger -->smaller
//long-->int
//double-->float


public class TypeCastingConcept {

	public static void main(String[] args) {
		//Upcasting-automatic---smaller-->larger
		System.out.println("................................Upcasting................................");
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		float floatvalue=10.00f;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		
		//downcasting-manually --larger-->smaller
		System.out.println("................................Downcasting..............................");
        long l=1234567;
        int i=(int)l;
        System.out.println(i);
        
        double d=12.345678909;
        float fl=(float)d;
        System.out.println(fl);
        
        System.out.println("..............................Examples...................................");
        //Example-1
        int a=10;
        double b=a;//upcasting
        System.out.println(b);
        
        //Example-2
        double c =10.5;
        int e=(int)c;//downcasting
        System.out.println(e);
        
        
	}

}
