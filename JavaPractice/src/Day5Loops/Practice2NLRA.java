package Day5Loops;
public class Practice2NLRA {

	public static void main(String[] args) {
		int k=1;
		/*Ex:1
		 1 2 3 4
		 5 6 7
		 8 9
		 10*/
		for (int i=0;i<4;i++) {
			 //System.out.println("Outer Loop Started");
			 for(int j=1;j<=4-i;j++) {
				 System.out.print(k + " ");
				 k=k+1;
			 }
			 System.out.println();
		}
		/*Ex:2
		 1 
		 2 3 
		 4 5 6
		 7 8 9 10*/
        k=1;
		for(int i=1;i<=4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		/*Ex:3
		 1 
		 1 2
		 1 2 3
		 1 2 3 4*/
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
