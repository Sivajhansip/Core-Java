package Day7Arrays_2DynamicInputalso;

import java.util.Scanner;

//Searching an element in array
public class SearchingElementsinArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		boolean status=false;
		//int Search_Num=4;
		Scanner sc=new Scanner(System.in);
		int Search_Num=sc.nextInt();
		for(int i=0;i<=4;i++) {
			if(a[i]==Search_Num) {
				System.out.println("Element found at index : "+i);
			    status=true;
				break;
			}
		}
		if(!status)
			System.out.println("Element not found");

	}

}
