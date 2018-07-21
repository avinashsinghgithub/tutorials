package collections.iterators;
import java.util.Collections;
import  java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class IteratorsTest1 {
	public static void main (String [] args){
		HashMap<String, String> map =new HashMap();
		//Map map = Collections.synchronizedMap(new HashMap());
		map.put("avinash","singh");
		map.put("prabhu","singh");
		map.put("abhishek","singh");
		 Set<String> setOfKeys=map.keySet();
		 
		 
		 Iterator itr =map.keySet().iterator();
		 System.out.println("element is being removed");
		// map.remove("avinash");
		 setOfKeys.remove("prabhu");
		 while(itr.hasNext()){
			 System.out.println(itr.next());
		 }
	}

	

}
