package collections.comparable;
/**
 * here we have extended a class which had not implemented comparable 
 * the subclass implemented and can be be added to tree set. 
 */
import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample2 {
	public static void main (String[] args){
		TreeSet<PermanentEmployee> studentSet= new TreeSet<PermanentEmployee>();
		studentSet.add(new PermanentEmployee(1,"avinash2","bihta1"));
		studentSet.add(new PermanentEmployee(1,"avinash1","patna2"));
		studentSet.add(new PermanentEmployee(1,"avinash5","bangalore5"));
		studentSet.add(new PermanentEmployee(1,"madhav","bihta"));
		
		Iterator<PermanentEmployee> itr= studentSet.iterator();
		while (itr.hasNext()){
			PermanentEmployee pe=itr.next();
			System.out.println(pe.name+" "+pe.address);
		}
		
		
	}

 
}
class Employee  {
	String name ;
	String address;
	int id;
	
	Employee(int id,String name, String address){
		this.address=address;
		this.name=name;
		this.id=id;
	}

}	


class PermanentEmployee extends Employee implements Comparable <Employee>{
	PermanentEmployee(int id, String name, String address) {
		super(id, name, address);
		// TODO Auto-generated constructor stub
	}

	String mode="permanent";

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if(name.compareTo(e.name)==0){
		return address.compareTo(e.address);
		}else{
			return name.compareTo(e.name);
		}
	}
}
