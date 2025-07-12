package Day12PolymorphismMethodOverloadingConstructerOverloading;

public class AdderMethodOverloading {
	int a=2,b=2;
		
		void sum() {
			System.out.println(a+b);
		}
		
		void sum(int x,int y) {
			System.out.println(x+y);
		}
		
		void sum(double x,double y) {
			System.out.println(x+y);
		}
		
		void sum(int x,double y) {
			System.out.println(x+y);
		}
		
		void sum(double y,int x) {
			System.out.println(x+y);
		}


}
