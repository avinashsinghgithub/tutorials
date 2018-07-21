package collections.arrayListAndVector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList{    
	 public static void main(String args[]){    
	     
	  List<String> al=new ArrayList<String>();//creating arraylist    
	  al.add("Sonoo");//adding object in arraylist    
	  al.add("Michael");    
	  al.add("James");    
	  al.add("Andy"); 
	  al.add(null);
	  al.remove(1);
	   //traversing elements using Iterator  
	  Iterator itr=al.iterator();  
	//  al.remove(1); //ConcurrentModificationException will be thrown
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  } 
	  
	  System.out.println("== List iterator in action==");
	  ListIterator<String> listItr=al.listIterator(al.size()); 
	  while(listItr.hasPrevious()){
		  System.out.println(listItr.previous());
		  
	  }
	  
//	  while(listItr.hasNext()){
//		  System.out.println(listItr.next());
//		  
//	  }
	 }    
	}    