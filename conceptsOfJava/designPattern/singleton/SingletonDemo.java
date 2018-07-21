package designPattern.singleton;

import java.io.Serializable;

public class SingletonDemo {
	public static void main (String[] args){
		Singleton s;
		
		s=Singleton.getInstance();
		if(s==null){
			System.out.println("Null found");
		}
		
		Singleton s2=Singleton.getInstance();
		
		if(s2==null){
			System.out.println("s2 is null");
		}
	}

}
class Singleton implements Serializable ,Cloneable{
	static Singleton instance;//=new Singleton();
	String name;
	private Singleton(String name){
		this.name= name;
	}
	static Singleton getInstance(){
		synchronized(Singleton.class){
			if(instance==null){
				System.out.println("inside the static method");
				instance=new Singleton("avinash");
			}
		return instance;
		}
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}