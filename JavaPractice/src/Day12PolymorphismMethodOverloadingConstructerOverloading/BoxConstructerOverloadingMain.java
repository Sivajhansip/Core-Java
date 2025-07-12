package Day12PolymorphismMethodOverloadingConstructerOverloading;

public class BoxConstructerOverloadingMain {

	public static void main(String[] args) {
		BoxConstructerOverloading b=new BoxConstructerOverloading();
        System.out.println(b.volume());//0.0
        BoxConstructerOverloading b1=new BoxConstructerOverloading(10);
        System.out.println(b1.volume());//1000.0
        BoxConstructerOverloading b2=new BoxConstructerOverloading(1,2,3);
        System.out.println(b2.volume());//6.0
	}

}
