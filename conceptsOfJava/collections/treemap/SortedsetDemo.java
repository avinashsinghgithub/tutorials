package collections.treemap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SortedsetDemo {
	
	public static void main (String arg[]){
		Set<Student> set = new  HashSet<Student>();
		set.add(new Student("avinash","bihta"));
		set.add(new Student("avinash","bihta"));
		set.add(new Student("avinash","bihta"));
		
		Iterator<Student> itr= set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().name);
		}
	}
	

}
class Student {
	String name;
	String address;
	Student(String name,String address){
		this.name=name;
		this.address=address;
	}
//	public int hashcode(){
//		return name.hashCode();
//	}
	public boolean equals(Object o){
		return ((Student)o).address.equals(address);
	}
}
