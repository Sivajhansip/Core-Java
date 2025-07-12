package Day7Arrays_2DynamicInputalso;
//Find how many times a number is repeated..
public class HowManyTimesNumberRepeatedInArray {

	public static void main(String[] args) {
		int a[]= {10,11,12,13,10,14,10};
		int Num_find=11;
		int count=0;
		for(int i:a)
		{
			if(i==Num_find)
				count++;
		}
		System.out.println("Number "+Num_find+" Repeated in array for "+count+" times");

	}

}
