package Day11MethodsConstructers;

public class Student {
   int sid;
   String sname;
   char grade;
   
   void printstuData() {
	   System.out.println("sid: "+sid+" sname: "+sname+" Grade: "+grade);
   }
   
   void setStuData(int id,String name,char g) {
	   sid=id;
	   sname=name;
	   grade=g;
   }
   
   //Constructer
   Student(int id,String name,char g){
	   this.sid=id;
	   this.sname=name;
	   this.grade=g;  
	}
	


}
