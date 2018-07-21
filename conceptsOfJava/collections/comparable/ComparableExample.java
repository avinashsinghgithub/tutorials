package collections.comparable;
/**
 * we cann't add an instance of a class which had not implmented comparable .
 * while declaring the tree set we can change the below line 
 * TreeSet studentSet= new TreeSet<>();
 * to 
 * TreeSet<Student> studentSet= new TreeSet<Student>();
 * to make it more clear what kind of objects are going to get stored.
 */
		
import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main (String[] args){
		TreeSet studentSet= new TreeSet<>();
		studentSet.add(new Student(1,"avinash","bihta"));
		studentSet.add(new Student(1,"avinash","patna"));
		studentSet.add(new Student(1,"avinash","bangalore"));
		studentSet.add(new Student(1,"madhav","bihta"));
		//studentSet.add(new Men());
		//Men cannot be cast to java.lang.Comparable
		
		Iterator<Student> itr= studentSet.iterator();
		while (itr.hasNext()){
			System.out.println((itr.next()).address);
		}
		
		
	}

 
}
class Student implements Comparable {
	String name ;
	String address;
	int id;
	
	Student(int id,String name, String address){
		this.address=address;
		this.name=name;
		this.id=id;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Student s= (Student)arg0;
		return name.compareTo(s.name);
		}
	}


class Men{
	char gender ='M' ;
	
}
