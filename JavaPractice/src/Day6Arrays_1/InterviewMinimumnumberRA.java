package Day6Arrays_1;
public class InterviewMinimumnumberRA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min,max;
		int a[][]= {{4,5,6},{1,2,3},{0,1,2}};
		min=a[0][0];
		max=a[0][0];
		//Min number
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if (a[i][j]<min)
				{
					min=a[i][j];
				}
			}
		}
		//max number
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if (a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println("Minimum number : "+min);
		System.out.println("Maximum number : "+max);
		/*
		 1 4 5
		 3 0 9
		 5 10 1*/
		
		/*algorithm
		 Step-1 : Find the minimum value in matrix
		 Step-2 : Find the column number where we find the min value
		 Step-3 : Find the Maximum value in column number of step-2
		
		 */
		/* own practice
		int b[][]= {{1,4,5},{3,0,9},{5,10,1}};
		int mincolumn=0;
		int min_value=b[0][0];
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if(b[i][j]<min_value) {
					min_value=b[i][j];
					mincolumn=j;
					}
			}
		}
		int Maxcolumn_value=b[0][mincolumn];
		for(int i=0;i<3;i++) {
			if(b[i][mincolumn] > Maxcolumn_value) {
				Maxcolumn_value=b[i][mincolumn];
				
			}
		}*/
		//from tutorial
		int b[][]= {{1,4,5},{3,0,9},{5,10,1}};
		int mincolumn=0;
		int min_value=b[0][0];
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if(b[i][j]<min_value) {
					min_value=b[i][j];
					mincolumn=j;
					}
			}
		}
		int k=0;
		int Maxcolumn_value=b[0][mincolumn];
		while(k<3) {
			if(b[k][mincolumn]>Maxcolumn_value) {
				Maxcolumn_value=b[k][mincolumn];
			}
			k++;
			
		}
		System.out.println("Maximum column value : "+Maxcolumn_value);

	}

}
