package Day20Collections;

import java.util.*;

public class HashsetDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashSet myset=new HashSet();
		//Set myset=new HashSet();
        //HashSet<String> myset=new HashSet<String>();
		myset.add(100);
		myset.add("welcome");
		myset.add(10.5);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//Printing Hashset
		System.out.println(myset);//[null, 100, 10.5, welcome]
		
		//Removing element
		System.out.println("Removing Element from set.............");
		myset.remove(100);
		System.out.println(myset);//[null, 10.5, welcome]
		
		//Inserting element --Not possible because it is not index based
		//Access sepecific element--Not possible it is not index based
		System.out.println("Accessing specific element from myset.........");
		//workaround for accessing specific element from myset
		//Convert hashset-->Arraylist
		ArrayList al=new ArrayList(myset);
		System.out.println(al);//[null, 10.5, welcome]
		System.out.println(al.get(2));//welcome
		
		System.out.println("Reading all the elements using loop..........");
		/*//Read all the elements using for each loop
		for(Object a:myset) {
			System.out.println(a);
		}*/
		
		//Using Iterator
		/*null
          10.5
          welcome*/
		Iterator it=myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		System.out.println("Clearing elements in hashset.......");
		//Clearing all the elements in hashset
		myset.clear();
		System.out.println(myset);
		System.out.println(myset.isEmpty());
	}

}
