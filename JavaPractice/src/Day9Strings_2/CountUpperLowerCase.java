package Day9Strings_2;

public class CountUpperLowerCase {

	public static void main(String[] args) {
		String s="Hello World! Java is FUN.";
		int lowercount=0,uppercount = 0;
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>=65&&ch[i]<=90) {
				uppercount++;
				
			}
			else if(ch[i]>=97&&ch[i]<=122) {
				lowercount++;
			}
		}
        System.out.println(uppercount++);
        System.out.println(lowercount++);
	}

}
