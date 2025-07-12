package Day10OOPSconceptsClassObject;

public class EmployeeClassMain {

	public static void main(String[] args) {
		//System.out.println(new EmployeeClass().empid=101);//Object reference
		EmployeeClass emp=new EmployeeClass();
		emp.empid=101;
		emp.empname="xxxx";
		emp.position="fresher";
		emp.sal=27000;
		
		emp.display();

	}

}
