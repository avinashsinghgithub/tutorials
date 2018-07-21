package concurrentHashMapInThreads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyChecks {
	
	public static void main(String [] args) throws InterruptedException{
		List<String> keys= new ArrayList<String>();

		List<Integer> values1= new ArrayList<Integer>();
		List<Integer> values2= new ArrayList<Integer>();
		Resources r= new Resources();
		keys.add("A");keys.add("B");keys.add("C");
		keys.add("D");keys.add("E");keys.add("F");
		
		values1.add(1);values1.add(2);values1.add(3);
		values1.add(4);values1.add(5);values1.add(6);
		
		values2.add(7);values2.add(8);values2.add(9);
		values2.add(10);values2.add(11);values2.add(12);
		
		(new Thread(new Name(keys,values2,r,"second"))).start();
		Thread.sleep(1000);
		
		//Thread.sleep(1000);
		(new Thread(new Name(r,"third"))).start();
		(new Thread(new Name(keys,values1,r,"first"))).start();
		
	}
}
class Name implements Runnable{
	String name;
	List<String> keys;
	List<Integer> values;
	Resources r;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(keys !=null){
			try {
				r.createAMap(keys, values,name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		r.displayAMap(name);
	}
	
	Name(List<String> keys,List<Integer> values,Resources r,String name){
		this.keys=keys;
		this.values=values;
		this.r=r;
		this.name=name;
	}
	Name(Resources r,String name){
		this.r=r;
		this.name=name;
	}
}
class Resources{
	ConcurrentHashMap<String, Integer> map;
	void createAMap(List<String> keys,List<Integer> values,String name) throws InterruptedException{
		map= new ConcurrentHashMap<String,Integer>();
		int i=0;
		while(i<keys.size()&& i<values.size()){
			System.out.println("thread name : "+name+" :value being inserted "+ keys.get(i)+" & "+ values.get(i));
			synchronized(this){
			map.putIfAbsent(keys.get(i), values.get(i));
			}
			System.out.println("thread name : "+name+" :done inserting "+ values.get(i) );
			Thread.sleep(500);
			i++;
		}
	}
	void displayAMap(String threadName){
		String name;
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext()){
			name=itr.next();
			System.out.println("thread name : "+threadName+" alphabet is : "+name+" value is :"+map.get(name));
		}
	}
} 