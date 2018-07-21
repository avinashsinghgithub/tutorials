package concurrentHashMapInThreads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
 
public class ConcurrentHashMapUsage {
	
	public static void main(String[] args){
		Resource r=new Resource();
		Thread t1=new Thread(new Names(r,"first"));
		Thread t2=new Thread(new Names(r,"second"));
		t1.start();
		t2.start();
	}
	

}

class Names implements Runnable{
	Resource r;
	String name;
	 Names(Resource r, String name){
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
class Resource {
	ConcurrentHashMap<String,Integer> map;
	void createAMap(String name) throws InterruptedException{
		map= new ConcurrentHashMap<String,Integer>(1);
		map.put("avinash",1);
		map.put("prabhu",2);
		map.put("sambhu",4);
		map.put("keshav",5);
		map.put("parth",3);
		Thread.sleep(1000);
	Iterator<String> itr=map.keySet().iterator();
	
	while(itr.hasNext()){ 
		String sname=itr.next();
		System.out.println("thread: "+name+": "+sname+" rank "+map.get(sname));
	}
	map.remove("avinash");
	} 
}
