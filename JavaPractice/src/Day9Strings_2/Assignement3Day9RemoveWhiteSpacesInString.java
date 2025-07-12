package Day9Strings_2;
/*
 we l co m e
output: welcome
 */
public class Assignement3Day9RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		String s="we l co m e";
		String st="";
		st=s.replaceAll("\\s", "");
		System.out.println(s.replace(" ", ""));
		System.out.println(st);

	}

}
