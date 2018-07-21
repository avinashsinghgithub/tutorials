package collections.arrayListAndVector;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class TestVector{      
	 public static void main(String args[]){      
	  Vector<String> v=new Vector<String>();//creating vector  
	  v.add("umesh");//method of Collection  
	  v.addElement("irfan");//method of Vector  
	  v.addElement("kumar"); 
	  v.addElement("avinash");
	  v.addElement("abhishek");
	  v.addElement("prabhat");
	  v.addElement("prashant");
	  v.addElement(null);
	  //traversing elements using Enumeration  
	  
	  Enumeration<String> e=v.elements();  
	  while(e.hasMoreElements()){  
	   System.out.println(e.nextElement());  
	  }  
		
	 
	 ListIterator<String> listItr= v.listIterator(v.size());
	 //v.remove(2);
	/*
	 while(listItr.hasNext()){
		 System.out.println(listItr.next());
	 }
	 
	 */
	 System.out.println("List in reverse");
	 
	 while(listItr.hasPrevious()){
		 System.out.println(listItr.previous());
	 }
	 
	 
	 }
}		      