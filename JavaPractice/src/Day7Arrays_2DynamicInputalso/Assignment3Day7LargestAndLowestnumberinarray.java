package Day7Arrays_2DynamicInputalso;
//Find largest & lowest number in array/

public class Assignment3Day7LargestAndLowestnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		
		int smallest_number=a[0];
		int largest_number=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<smallest_number) {
				smallest_number = a[i];
				//smallest_number= a[i];
			}
		}
		for(int i=1;i<a.length;i++) {
			if(a[i]>largest_number) {
				largest_number = a[i];
				//smallest_number= a[i];
			}
		}
		System.out.println("Smallest_Number : "+smallest_number);
		System.out.println("Largest_Number : "+largest_number);
		}
		

	}

