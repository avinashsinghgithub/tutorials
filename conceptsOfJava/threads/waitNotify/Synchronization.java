package threads.waitNotify;

class Resource{
	int i;
	boolean stopSubmission =false;
	synchronized void submittedValue(int i) throws InterruptedException{
		while(stopSubmission==true)
			wait();
		System.out.println("submitted Value : "+i);
		this.i=i;
		stopSubmission=true;
		notify();
		
	}
	synchronized void acceptedvalue() throws InterruptedException{
		while(stopSubmission==false)
			wait();
		System.out.println("accepted Value : "+i);
		stopSubmission=false;
		notify();
	}
}
class A implements Runnable{
	Thread t;
	Resource resource ;
	A(Resource resource ){
		t=new Thread(this);
		this.resource=resource;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<26;i++)
			try { 
				resource.submittedValue(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}

class B implements Runnable{
	Thread t;
	
	Resource resource ;
	
	B(Resource resource ){
		this.resource=resource;
		t=new Thread(this);
	}
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<26;i++)
			try {
				resource.acceptedvalue();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
public class Synchronization {
	public static void main(String[] args){
	Resource resource = new Resource();
	B b= new B(resource);
	A a= new A(resource);
	a.t.start();
	b.t.start();
	}
}	