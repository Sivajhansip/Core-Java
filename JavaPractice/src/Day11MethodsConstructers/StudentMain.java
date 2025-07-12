package Day11MethodsConstructers;

public class StudentMain {

	public static void main(String[] args) {
	
	//1)Assign data using object approach
    Student stu=new Student(101, "xxxx", 'B');
   
    
    /*stu.sid=101;
    stu.sname="xxxx";
    stu.grade='A';
    stu.printstuData();*/
    
    //2)Assigning data using user defined method
    
    /*stu.setStuData(101, "xxxx", 'B');
    stu.printstuData();*/
    
    //3)Using Constructer
     
    stu.printstuData();
	}

}
