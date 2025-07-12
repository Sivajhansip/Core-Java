package Day17DataConversionWrapperClassJavaPackages;

public class DataConversion {

	public static void main(String[] args) {
		
		//Scenario-1 :String --->int,double,bool,char(not possible)(unboxing)
		
		//String-->int
		//String s="welcome";//cannot convert to number
		
		String s1="10";
		String s2="11";
		
		int sum1=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(sum1);//21
		
		//String-->double
		
		String s3="10.0";
		String s4="11.0";
		double sum2=Double.parseDouble(s3)+Double.parseDouble(s4);
		System.out.println(sum2);//21.0
		
		//String-->boolean
		
		String s5="true";
		boolean bool=Boolean.parseBoolean(s5);
		System.out.println(bool);//true
		
		
		//Scenario--2 int,double,char,boolean-->string(Auto boxing)
		int i=10;
		String t1=String.valueOf(i);
		System.out.println(t1);//10
		
		double d=10.098;
		String t2=String.valueOf(d);
		System.out.println(t2);//10.098
		
		char c='D';
		String t3=String.valueOf(c);
		System.out.println(t3);//D
		
		boolean bool1=true;
		String t4=String.valueOf(bool1);
		System.out.println(t4);//true
		
       //Scenario-3 int-->double
		int i1=123;
		double d1=i1;
		System.out.println(d1);//123.0
		
		//Scenario-4 double-->int
		double d2=19.3;
		int i3=(int)d2;
		System.out.println(i3);//19
	}

}
