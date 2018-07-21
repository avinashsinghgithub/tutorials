package collections.arrayListAndVector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

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

class StudentUnsorted  {
	String name ;
	String address;
	int id;
	
	StudentUnsorted(int id,String name, String address){
		this.address=address;
		this.name=name;
		this.id=id;
	}

	
	}
public class SortMethodsTest{
	//@SuppressWarnings("unchecked")
	public static void main(String [] args){
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1,"avinash","bihta"));
		studentList.add(new Student(1,"sachin","mumbai"));
		studentList.add(new Student(1,"vikash","kolkata"));
		studentList.add(new Student(1,"madhav","patna"));
		
		Iterator<Student> itr=  studentList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().name);
		}
		Collections.sort(studentList);
		System.out.println("= after sorting = ");
		itr=  studentList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().name);
		}
		
		System.out.println("= unsorted student list = ");
		ArrayList<StudentUnsorted> studentUnsortedList = new ArrayList<StudentUnsorted>();
		studentUnsortedList.add(new StudentUnsorted(1,"avinash","bihta"));
		studentUnsortedList.add(new StudentUnsorted(1,"sachin","mumbai"));
		studentUnsortedList.add(new StudentUnsorted(1,"vikash","kolkata"));
		studentUnsortedList.add(new StudentUnsorted(1,"madhav","patna"));
		//Collections.sort(studentUnsortedList);//wont compile 
		Iterator<StudentUnsorted> itr2=  studentUnsortedList.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next().name);
		}
		Student [] arr= new Student[4];
		arr[0]=new Student(1,"avinash","bihta");
		arr[1]=new Student(1,"sachin","mumbai");
		arr[2]=new Student(1,"vikash","kolkata");
		arr[3]=new Student(1,"madhav","patna");
		
		int [] m = {1,2,3,4,6,1};
		
		Arrays.sort(arr); //doesn't work for an array of  StudentUnsorted 
		/**
		 * this work for arr when it contains objects of Students
		 * because of the implementation of Comparable class 
		 * 
		 */
		System.out.println("sorting the student array");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].name);
	} 
		Arrays.sort(m);
		for(int i=0;i<m.length;i++){
			System.out.println(m[i]);
	} 
}
}