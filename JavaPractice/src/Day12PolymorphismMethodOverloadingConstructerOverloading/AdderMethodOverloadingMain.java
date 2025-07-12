package Day12PolymorphismMethodOverloadingConstructerOverloading;

public class AdderMethodOverloadingMain {

	public static void main(String[] args) {
		AdderMethodOverloading ad=new AdderMethodOverloading();
		ad.sum();//4
        ad.sum(1,2);//3
        ad.sum(1.0,1.2);//2.2
        ad.sum(1,2.0);//3.0
        ad.sum(2.2,5);//7.2
	}

}
