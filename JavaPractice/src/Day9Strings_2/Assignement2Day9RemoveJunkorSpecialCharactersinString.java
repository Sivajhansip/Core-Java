package Day9Strings_2;
/*wel&&^^%%*())*come
output: welcome*/

public class Assignement2Day9RemoveJunkorSpecialCharactersinString {

	public static void main(String[] args) {
		String s="wel&&^^%%*())*come";
		String replaced_string=s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(replaced_string);

	}

}
