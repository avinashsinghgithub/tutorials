package collections.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Student {

	int id;
	String name;
	String address;
	Student(int id, String name, String address){
		this.id=id;
		this.name=name;
		this.address=address;
		}
	@Override
	public int hashCode(){
		return (id+address).hashCode();
			
	}
	@Override
	public boolean equals(Object s){
			return name.equals(((Student)s).name);
	}
	}
public class HashMapTest1 {
	
	public static void main(String [] args){
		HashMap<Student,String> map= new HashMap<Student,String>(5);
		map.put(new Student(1, "avinash","bihta"),"Infosys");
		map.put(new Student(1, "avinash1","bihta"),"TCS");
		map.put(new Student(1, "avinash","bangalore"),"Infosys");
		
		Set<Entry<Student,String>> entry= map.entrySet();
		Iterator<Entry<Student, String>> itr= entry.iterator();
		while(itr.hasNext()){
			System.out.println("address is "+itr.next().getKey().address);
		}

}
}