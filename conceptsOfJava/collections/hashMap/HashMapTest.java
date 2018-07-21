package collections.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapTest {
   // Statics
   public static void main( String [] args ) {
      System.out.println( "Collection HashMap Test" );
      HashMap<String, String> collection1 = new HashMap<String, String>();
      // Test the Collection interface
      System.out.println( "Collection 1 created, size=" + collection1.size() + 
         ", isEmpty=" + collection1.isEmpty() );
      // Adding
      collection1.put( new String( "Harriet" ), new String( "Bone" ) );
      collection1.put( new String( "Bailey" ),  new String( "Big Chair" ) );
      collection1.put( new String( "Max" ),     new String( "Tennis Ball" ) );
      collection1.put( null,     new String( "cricket" ) );
      collection1.put( null,     new String( "boxing gloves" ) );
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
      collection1.clear();
      System.out.println( "Collection 1 cleared, size=" + collection1.size() + 
         ", isEmpty=" + collection1.isEmpty() );
         
       
      Set<Entry<String, String>> entry =collection1.entrySet();
      Iterator<Entry<String, String>> itr=entry.iterator();
     Entry<String, String> entryOfSet;
      while(itr.hasNext()){
    	  entryOfSet =itr.next();
    	  System.out.println("Key is :"+entryOfSet.getKey()+" and Value is :"+entryOfSet.getValue());
      }
   }
}