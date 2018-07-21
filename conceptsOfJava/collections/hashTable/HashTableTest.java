package collections.hashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableTest {
   // Statics
   public static void main( String [] args ) {
      System.out.println( "Collection Hashtable Test" );
      Hashtable<String, String> collection1 = new Hashtable<String, String>();
      // Test the Collection interface
      System.out.println( "Collection 1 created, size=" + collection1.size() + 
         ", isEmpty=" + collection1.isEmpty() );
      // Adding
      collection1.put( new String( "Harriet" ), new String( "Bone" ) );
      collection1.put( new String( "Bailey" ),  new String( "Big Chair" ) );
      collection1.put( new String( "Max" ),     new String( "Tennis Ball" ) );
      collection1.put( null,     new String( "cricket" ) );//would throw run time exception
      System.out.println( "Collection 1 populated, size=" + collection1.size() + 
         ", isEmpty=" + collection1.isEmpty() );
      // Test Containment/Access
      String key = new String( "Harriet" );
    
      if ( collection1.containsKey( key ) )
         System.out.println( "Collection 1 access, key=" + key + ", value=" + 
            (String) collection1.get( key ) );
      // Test iteration of keys and values
      Set<String> keys = collection1.keySet();
      System.out.println( "Collection 1 iteration (unsorted), collection contains keys:" );
      Iterator<String> iterator = keys.iterator();
      while ( iterator.hasNext() )
         System.out.println( "   " + iterator.next() );
      //collection1.clear();
      //System.out.println( "Collection 1 cleared, size=" + collection1.size() + 
      //   ", isEmpty=" + collection1.isEmpty() );
      Set<Entry<String, String>> entry =collection1.entrySet();
      Iterator<Entry<String, String>> itr=entry.iterator();
     Entry<String, String> entryOfSet;
      while(itr.hasNext()){
    	  entryOfSet =(Entry<String, String>) itr.next();
    	  System.out.println("Key is :"+entryOfSet.getKey()+" and Value is :"+entryOfSet.getValue());
      }
   }
}