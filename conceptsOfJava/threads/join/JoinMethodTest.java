package threads.join;

public class JoinMethodTest {
	public static void main (String [] args){
		Resource r= new Resource(1);
		Thread t1= new Thread(new JoinMethodTestThread(r,"Thread 1",null));
		Thread t2= new Thread(new JoinMethodTestThread(r,"Thread 2",t1));
		Thread t3= new Thread(new JoinMethodTestThread(r,"Thread 3",t2));
		Thread t4= new Thread(new JoinMethodTestThread(r,"Thread 4",t3));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
class JoinMethodTestThread implements Runnable {
	Resource r;
	String name;
	Thread runnable;
	public void run(){
		if(runnable!=null){
			try {
				runnable.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		r.display(name);
		
	}
	JoinMethodTestThread(Resource r,String name,Thread runnable){
		this.name=name;
		this.r=r;
		this.runnable =runnable;
	}

}

class Resource {
	int num ;
	void display(String name){
		System.out.println("number is "+num+" and the thread is "+name);
		num++;
	}
	Resource(int num){
		this.num=num;
	}
}