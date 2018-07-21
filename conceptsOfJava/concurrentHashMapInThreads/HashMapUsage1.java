package concurrentHashMapInThreads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
 
public class HashMapUsage1 {
	
	public static void main(String[] args){
		Resource1 r=new Resource1();
		Thread t1=new Thread(new Names1(r,"first"));
		Thread t2=new Thread(new Names1(r,"second"));
		t1.start();
		t2.start();
	}
	

}

class Names1 implements Runnable{
	Resource1 r;
	String name;
	 Names1(Resource1 r, String name){
		this.r=r;
		this.name=name;
	}
	public void run() {
		// TODO Auto-generated method stub
		try {
			r.createAMap(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class Resource1 {
	HashMap<String,Integer> map;
	void createAMap(String name) throws InterruptedException{
		map= new HashMap<String,Integer>();
		map.put("avinash",1);
		map.put("prabhu",2);
		map.put("sambhu",4);
		map.put("keshav",5);
		map.put("parth",3);
		Map<String, Integer> syncMap =Collections.synchronizedMap(map);
		Thread.sleep(1000);
	Iterator<String> itr=syncMap.keySet().iterator();
	
	while(itr.hasNext()){ 
		String sname=itr.next();
		System.out.println("thread: "+name+": "+sname+" rank "+map.get(sname));
	}
	syncMap.remove("avinash");
	} 
}
