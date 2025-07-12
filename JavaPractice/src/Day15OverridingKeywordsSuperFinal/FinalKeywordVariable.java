package Day15OverridingKeywordsSuperFinal;
class Test{
   final int x=10;
   void print() {
	   System.out.println(x);
   }
}
public class FinalKeywordVariable {

	public static void main(String[] args) {
		Test t=new Test();
		//t.x=100; --we cannot change the variable value if it is defined with final keyword
		System.out.println(t.x);

	}

}
