package Day9Strings_2;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		int a[]= {20,40,70,50,60};
		int b[]=a;
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);//mutable--can change
		System.out.println(Arrays.toString(a));//[20, 40, 50, 60, 70]
		
		

	}

}
