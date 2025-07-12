package Day5Loops;
public class Practice1NLRA {

	public static void main(String[] args) {
		int r=1;
        int c=4;
		// TODO Auto-generated method stub
       //nested for loops
		/*Ex:1
		 1 2 3 4
		 5 6 7
		 8 9
		 10
         Own try*/
         for (int i=4;i>0;i--) {
		  //System.out.println(i);
		 for(int j=0;j<c;j++) {
				 System.out.print(r+" ");
				 r=r+1;
		}
			 System.out.println();
		 c=c-1;
		 }
		 /*Ex:2
		 1 
		 2 3 
		 4 5 6
		 7 8 9 10*/
         c=1;
		 for(int i=1;i<=4;i++) {
			for(int j=0;j<=i-1;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
		 /*Ex:3
		 1 
		 1 2
		 1 2 3
		 1 2 3 4*/
		c=1;
		for(int i=1;i<=4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
			c=1;
	     }
		/*Ex:4
		 3 
		 6 9
		 12 15 18
		 21 24 27 30*/
		c=3;
		int m=1;
		for(int i=1;i<=4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(c*m+" ");
				m++;
			}
			System.out.println();
	     }
   }
}
