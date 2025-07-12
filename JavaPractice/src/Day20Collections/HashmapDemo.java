package Day20Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapDemo {

	public static void main(String[] args) {
		
		//Declaration
		//HashMap hm=new HashMap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding Pairs 
		hm.put(101, "aaa");
		hm.put(102, "bbb");
		hm.put(103, "ccc");
		hm.put(104, "ddd");
		hm.put(105, "eee");
		hm.put(101, "xxx");
		
		System.out.println(hm);//{101=xxx, 102=bbb, 103=ccc, 104=ddd, 105=eee}
		
		System.out.println("Size of HashMap : "+hm.size());//6
		
		System.out.println("Remove Pair..............");
		hm.remove(103);
		System.out.println("After Removing pair:"+hm);//{101=xxx, 102=bbb, 104=ddd, 105=eee}
		
		System.out.println("Accessing value of key..........");
		System.out.println(hm.get(102));//bbb

		System.out.println("Accessing all the keys.........");
		System.out.println(hm.keySet());//[101, 102, 104, 105]
		
		System.out.println("Accessing all the values........");
		System.out.println(hm.values());//[xxx, bbb, ddd, eee]
		
		System.out.println("Accessing all the key value pair in set form..........");
		System.out.println(hm.entrySet());//[101=xxx, 102=bbb, 104=ddd, 105=eee]
		
		System.out.println("Reading data from hashMap.......");
		
		//Using fo each loop
		for(int k:hm.keySet()) {
			System.out.println(k+"   "+hm.get(k));
			/*101   xxx
              102   bbb
              104   ddd
              105   eee*/
		}
		
		//Using iterator
		Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
			/*101   xxx
            102   bbb
            104   ddd
            105   eee*/
		}
	}

}
