package Day7Arrays_2DynamicInputalso;

import java.util.Arrays;

//Sorting elements  using  for loop
public class Assignment1Day7Sortingelementsusingforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,0,5,6};
		//int temp;
		//bubble sort
		for (int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(a[i]>a[j])
				{
					//with temp
					/*temp=a[i];
					a[i]=a[j];
					a[j]=temp;*/
					//without temp
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		System.out.println("After sorting : "+Arrays.toString(a));
		/*for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}*/

	
	}

}
