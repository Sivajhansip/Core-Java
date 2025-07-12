package Day19ExceptionHandlingInJava;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		System.out.println("Program Started....");
		System.out.println("Program is in progress....");
		
		/*try {
			FileInputStream file=new FileInputStream("C:\\Users\\Spillibo\\OneDrive - Capgemini\\Documents\\file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		FileInputStream file=new FileInputStream("C:\\Users\\Spillibo\\OneDrive - Capgemini\\Documents\\file.txt");
        System.out.println(file.read());
        System.out.println("Program Ended....");
	}

}
