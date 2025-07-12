package Day7Arrays_2DynamicInputalso;

import java.util.Arrays;
import java.util.Collections;

public class Assignement1Day7SortingElementsinarrayusingbuiltinmethods {

	public static void main(String[] args) {
		int a[]= {0,5,2,4,3,1};
		//Approach-1
		/*System.out.println("Before sorting : "+Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("After sorting : "+Arrays.toString(a));*/
		
		//Approach-2
		System.out.println("Before sorting : "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting : "+Arrays.toString(a));
		
		//Sorting in descending order
		Integer b[]= {0,5,2,4,3,1};
		System.out.println("Before sorting : "+Arrays.toString(b));
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("After sorting : "+Arrays.toString(b));
		
	}

}
