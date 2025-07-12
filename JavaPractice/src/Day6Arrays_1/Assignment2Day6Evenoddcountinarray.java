package Day6Arrays_1;
//Print Even and Odd numbers  from array.
public class Assignment2Day6Evenoddcountinarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int even_count = 0,odd_count=0;
		/*for(int i=0;i<a.length;i++) {
			if (a[i]%2==0) {
				even_count++;
				}
			else {
				odd_count++;
			}
		}*/
		for(int j:a) {
			if (j%2==0) {
				even_count++;
				}
			else {
				odd_count++;
			}
		}
		System.out.println("Even count"+even_count);
		System.out.println("Odd count"+odd_count);
		

	}

}
