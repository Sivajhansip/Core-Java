package Day11MethodsConstructers;

public class ConstructerDemo {
	
	int x,y;
	
	ConstructerDemo(){//Default constructer/Non-parameterized
		x=10;
		y=20;
	}
	ConstructerDemo(int a,int b){//Parametrized constructer
		x=a;
		y=b;
	}

	void sum() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ConstructerDemo c=new ConstructerDemo();//Default one is accepted here
		c.sum();*/
		ConstructerDemo c=new ConstructerDemo(100,200);
		c.sum();

	}

}
