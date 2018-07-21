/**
 * 
 * this program demonstrate that we can use a treeset to add instances of more that one class 
 * we still can sort them if they both implement Comparable and there compareTo method 
 *  take care of casting appropriately . Check the implementation below.
 * 
 * 
 */

package collections.comparable;


import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample3 {
	public static void main (String[] args){
		TreeSet studentSet= new TreeSet();
		studentSet.add(new Student2(1,"avinash1","bihta"));
		studentSet.add(new Student2(1,"avinash21","patna"));
		studentSet.add(new Student2(1,"avinash22","bangalore"));
		studentSet.add(new Student2(1,"madhav1","bihta"));
		studentSet.add(new Men2(1,"madhavMen","bihta"));
		
		
		Iterator itr= studentSet.iterator();
		while (itr.hasNext()){
			Object obj = itr.next();
			if(obj.getClass().getName().equals("collections.comparable.Student2")){
				Student2 s = (Student2)obj;
				System.out.println(" this is an instance of student2 class, name is : " +s.name);
			}else{
				Men2 s = (Men2)obj;
				System.out.println(" this is an instance of student2 class, name is : " +s.name);
			}
			
				
		}
		
		
	}

 
}


 class Student2  implements Comparable  {
	String name ;
	String address;
	int id;
	
	Student2(int id,String name, String address){
		this.address=address;
		this.name=name;
		this.id=id;
	}

	@Override
	public int compareTo(Object arg0) {
		
		if(arg0.getClass().getName().contains("Student2")) {
		// TODO Auto-generated method stub
		Student2 s= (Student2)arg0;
		return name.compareTo(s.name);
		}else{
			Men2 s= (Men2)arg0;
			return name.compareTo(s.name);
		}
		
	}
 }

class Men2 implements Comparable {
	String name ;
	String address;
	int id;
	Men2(int id,String name, String address){
		this.address=address;
		this.name=name;
		this.id=id;
	}
	
	@Override
	public int compareTo(Object arg0) {
		
		if(arg0.getClass().getName().contains("Student2")) {
		// TODO Auto-generated method stub
		Student2 s= (Student2)arg0;
		return name.compareTo(s.name);
		}else{
			Men2 s= (Men2)arg0;
			return name.compareTo(s.name);
		}
		
	}
}
