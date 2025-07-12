package Day10OOPSconceptsClassObject;

public class EmployeeClass {
	
	int empid;
	String empname;
	int sal;
	String position;
	
	void display() {
		System.out.println(empid + " "+empname+" "+sal+" "+position);
	}

	/*public static void main(String[] args) {
		EmployeeClass emp=new EmployeeClass();
		emp.empid=101;
		emp.empname="xxxx";
		emp.position="fresher";
		emp.sal=27000;
		emp.display();
		
		EmployeeClass emp1=new EmployeeClass();
		emp1.empid=102;
		emp1.empname="****";
		emp1.position="Manger";
		//emp1.sal=270000;
		emp.sal=0;//prints 0
		emp1.display();
	

	}*/

}
