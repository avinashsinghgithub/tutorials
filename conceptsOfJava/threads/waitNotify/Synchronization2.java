package threads.waitNotify;

class Resources {
	char alphabet;
	boolean flag=true;
	boolean flagForM=false;
	synchronized void produced(char a) throws InterruptedException{
		if(flag!=true){
			System.out.println("waiting in produced !! ");
			wait();
			System.out.println("produced woken up");
		}
		alphabet=a;
		System.out.println("The Character Produced is "+alphabet);
		
		flag=false;
		if(a=='M'){
		flagForM=true;
		notifyAll();
		}else{
			notifyAll();
		}
		
	}
	synchronized void displayM() throws InterruptedException{
		while(!flagForM){
			System.out.println("waiting in displayM ");
			wait();
			System.out.println("displayM woken up");
		}
		System.out.println("found the character "+alphabet);
		flagForM=false;
		notifyAll();
	}
	
	synchronized void Consumed() throws InterruptedException{
		if(flag==true){
			System.out.println("waiting in Consumed !! ");
			wait();
			System.out.println("Consumed woken up");
		}
		System.out.println("The character consumed is "+alphabet);
		
		flag=true;
		notifyAll();
		
	}
	
}
public class Synchronization2 {
	public static void main (String [] args){
		Resources r=new Resources();
		Thread t1=new Thread(new Producer(r));
		Thread t2=new Thread(new Consumer(r));
		Thread t3=new Thread(new LooksForM(r));
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
class Producer implements Runnable {
	Resources r;
	
	Producer(Resources r){
	
		this.r=r;
	}
	@Override
	public void run() {
		for (char a='A';a<='Z';a++){
			try{
			//r.alphabet=a;	
			r.produced(a);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		
	}
	
}
class Consumer implements Runnable {
	Resources r;
	
	Consumer(Resources r){
		this.r=r;
		
	}
	
	@Override
	public void run() {
		for (int a=1;a<=26;a++){
			try{
			r.Consumed();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		}
		// TODO Auto-generated method stub
		
	}
	
}

class LooksForM implements Runnable {
	Resources r;
	
	LooksForM(Resources r){
		this.r=r;
		
	}
	
	@Override
	public void run() {
		try{
		r.displayM();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	}
	
}