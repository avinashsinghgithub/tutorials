package collections.treemap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
public class ReversingAMap {
	
	public static void main (String [] args){
		TreeMap<String, Integer> map= new TreeMap<String, Integer>();
		TreeMap<Marks, String> reverseKeyMap= new TreeMap<Marks, String>();
		Set<Marks> set = new HashSet<Marks>();
		map.put("avinash",30);
		map.put("amit",20);
		map.put("prabhu",20);
		map.put("ram",20);
		map.put("ravan",20);
		map.put("binesh",40);
		map.put("pintu",10);
		map.put("katoosh",25);
		//map.put(null,0);
		Set<String> keys=map.keySet();
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext()){
			String name=itr.next();
			
			System.out.println(name+ " "+map.get(name) );
			Marks m=new Marks(map.get(name));
			set.add(m);
			//set.add(null);
			reverseKeyMap.put(m, name);
		}
		
		Set<Marks>keys2=reverseKeyMap.keySet();
		Iterator<Marks> itr2=keys2.iterator();
		while(itr2.hasNext()){
			Marks m=itr2.next();
			System.out.println(m.num+ " name: "+reverseKeyMap.get(m));
		}
		Iterator<Marks> itr3= set.iterator();
		while(itr3.hasNext()){
			//System.out.println(itr3.next().num);
		}
	}

}
class Marks implements Comparable<Marks> {
	Integer num;
	
	public Marks(int num){
		this.num=num;
	}

	@Override
	public int compareTo(Marks marks) {
		// TODO Auto-generated method stub
		 if(this.num > marks.num){
			 return 1;
		 }else if (this.num < marks.num) {
			 return -1;
		 }else 
			 return 0;
		
		
	}

}
