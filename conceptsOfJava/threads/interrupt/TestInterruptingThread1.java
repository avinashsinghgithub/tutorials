package threads.interrupt;

public class TestInterruptingThread1 extends Thread{  
	public void run(){  
		try{  
			Thread.sleep(1000);  
			System.out.println("task");  
		}catch(InterruptedException e){  
			throw new RuntimeException("Thread interrupted... "+e);  
		}  
  
}  
  
public static void main(String args[]){  
	TestInterruptingThread1 t1=new TestInterruptingThread1();  
	t1.start(); 
	System.out.println("thread is interrupted "+t1.isInterrupted());
	try{  
		t1.interrupt();  
		System.out.println("thread is interrupted "+t1.isInterrupted());
	}catch(Exception e){System.out.println("Exception handled "+e);}  
  
	}  
}  