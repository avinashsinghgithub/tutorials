package collections.iterators;
import  java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class IteratorsTest {
	public static void main (String [] args){
		ConcurrentHashMap<String, String> map =new ConcurrentHashMap<String, String>();
		map.put("avinash","singh");
		map.put("prabhu","singh");
		map.put("abhishek","singh");
		 Enumeration<String> enumKeys=map.keys();
		 while (enumKeys.hasMoreElements()){
			 System.out.println(enumKeys.nextElement());
		 }
		 
		 Iterator<String> itr =map.keySet().iterator();
		 System.out.println("element is being removed");
		 map.remove("avinash");
		 while(itr.hasNext()){
			 System.out.println(itr.next());
		 }
	}

	

}
