package Day6Arrays_1;
public class ArraySorting_RA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Swapping
		method-1 using temp
		int a=5;
		int b=4;
		int temp;
		temp=a;
		a=b;
		b=temp;
		Method-2 without temp
		a=a+b;//9
		b=a-b;//5
		a=a-b;//4
		*/
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
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		
	}

}
