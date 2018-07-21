/**
 * here we are going to see the effect of returning same hashcode for 
 * every key .
 * 
 * result -
 * 
 */
package collections.hashMap;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class StudentV2 {

	int id;
	String name;
	String address;
	StudentV2(int id, String name, String address){
		this.id=id;
		this.name=name;
		this.address=address;
		}
	@Override
	public int hashCode(){
		return id;
			
	}
	@Override
	public boolean equals(Object s){
			return name.equals(((StudentV2)s).name);
	}
	}
public class HashMapTest2 {
	
	public static void main(String [] args){
		HashMap<StudentV2,String> map= new HashMap<StudentV2,String>(5);
		map.put(new StudentV2(1, "avinash","bihta"),"Infosys");
		map.put(new StudentV2(1, "avinash1","bihta"),"TCS");
		map.put(new StudentV2(1, "avinash","bangalore"),"Infosys");
		
		Set<Entry<StudentV2,String>> entry= map.entrySet();
		Iterator<Entry<StudentV2, String>> itr= entry.iterator();
		while(itr.hasNext()){
			
			
			//System.out.println("address is "+itr.next().getKey().address);
			 Entry <StudentV2,String> entriesFromItr = itr.next();
			System.out.println("student name : "+entriesFromItr.getKey().name
					+", address is  " + entriesFromItr.getKey().address);
		}

}
}