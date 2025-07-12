package Day17DataConversionWrapperClassJavaPackages;

public class WrapperClassesDemo {
    
    
	public static void main(String[] args) {
		//Primitive variables
	    int i=10;
	    double d=10.0;
	    char c='a';
	    boolean b=true;
	    
	    //Converting primitive type to object type --- Auto boxing
	    Integer iobj=i;
	    Double dobj=d;
	    Character cobj=c;
	    Boolean bobj=b;
	    
	    System.out.println(iobj);
	    System.out.println(dobj);
	    System.out.println(cobj);
	    System.out.println(bobj);
	    
	    //Converting object type to primitive type --- unboxing
	    int a1=iobj;
	    double a2=dobj;
	    char a3=cobj;
	    boolean a4=bobj;
	    
	    System.out.println(a1);
	    System.out.println(a2);
	    System.out.println(a3);
	    System.out.println(a4);

	}

}
