package Day8Strings_1;

import java.util.Arrays;

public class Objecttypearray {

	public static void main(String[] args) {
		Object a[]=new Object[5];
		a[0]=10;
		a[1]='a';
		a[2]=7;
		a[3]='i';
		a[4]=true;
		
		System.out.println(Arrays.toString(a));
		
		for(Object x :a) {
			System.out.println(x);
		}

	}

}
