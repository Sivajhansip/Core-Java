package Day20Collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//declaration
		ArrayList mylist=new ArrayList();
        //List myList=new ArrayList();--here List is interface so we created only object reference
		//ArrayList <String>mylist=new ArrayList<String> --here creating an arraylist of string type this can be used only when one type of data need to store
		
		//Adding data to arraylist
		System.out.println("Adding data to arraylist........");
		mylist.add(100);
		mylist.add(10.05);
		mylist.add(true);
		mylist.add("Java");
		mylist.add(null);
		mylist.add(100);
		
		//Size of arraylist
		System.out.println("Size of arraylist : "+mylist.size());//6
		
		//Printing arraylist
		System.out.println("Printing data from arraylist : "+mylist);//Printing data from arraylist : [100, 10.05, true, Java, null, 100]
		
		//Remove element from arraylist
		mylist.remove(5);//here 5 is index numbers
		System.out.println("After removing : "+mylist);//After removing : [100, 10.05, true, Java, null]
		
		//Insert element into arraylist in particular index
		mylist.add(3, "Python");
		System.out.println("After insertion : "+mylist);//After insertion : [100, 10.05, true, Python, Java, null]
		
		//Replace element in arraylist(change/modify)
		mylist.set(2,"C");
		System.out.println("After Replacement : "+mylist);//[100, 10.05, C, Python, Java, null]
		
		//Access specific element from arraylist
		System.out.println(mylist.get(3));//Python
		
		
		//Reading all the elements from arraylist
		
		//using normal for loop
		/*for(int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}*/
		
		//using for each loop
		/*for(Object s :mylist) {
			System.out.println(s);
		}*/
		
		//using iterator
		Iterator <Object> it=mylist.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
		
	    //Checking arraylist is empty or not
	    System.out.println("Is arraylist empty ? " +mylist.isEmpty());//false
	    
	    //Remove all elements from array list
	    ArrayList mylist2=new ArrayList();
	    mylist2.add(100);
	    mylist2.add(10.05);
	    
	    mylist.removeAll(mylist2);
	    System.out.println("After removing multiple elements:"+mylist);//[C, Python, Java, null]
	}

}
