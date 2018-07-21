package collections.comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student {
	int studentId;
	String name;
	String address;
	Student (int studentId,String name, String address){
		this.studentId=studentId;
		this.name=name;
		this.address=address;
	}
 public boolean equals(Object obj){
	return ((Student)obj).name.equals(this.name);
	
}
}
class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		return arg0.address.compareTo(arg1.address);
	}
	
	
}
public class ComparatorExample {
	public static void main (String ... a){
		Student s1=new Student(1,"Avinash","Bihta");
		Student s2=new Student(2,"Piku","Ara");
		Student s3=new Student(3,"Gautam","Patna");
		Student s4=new Student(4,"Avinash","Bihta");
		Student s5=new Student(5,null,"Paliganj");
		//System.out.println(s1.equals(s4));
		TreeSet<Student> ts= new TreeSet<Student>(new StudentComparator());
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		Iterator<Student> itr=ts.iterator();
		for(int i=0; i<ts.size();i++)
		System.out.println(itr.next().address);
	}
}

