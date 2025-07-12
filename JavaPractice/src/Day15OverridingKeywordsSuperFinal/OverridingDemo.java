package Day15OverridingKeywordsSuperFinal;

class Bank{
	double roi() {
		return 0;
	}
}

class SBI extends Bank{
	double roi() {
		return 5.7;
	}
}

class HDFC extends Bank{
	double roi() {
		return 8.7;
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		Bank b=new Bank();
		SBI s=new SBI();
		HDFC h=new HDFC();
		System.out.println(b.roi());
		System.out.println(s.roi());
		System.out.println(h.roi());

	}

}
