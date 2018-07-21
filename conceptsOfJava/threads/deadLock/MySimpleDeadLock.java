package threads.deadLock;

public class MySimpleDeadLock {
	public static void main (String [] args ){
		final Resource r1 = new Resource("avinash");
		final Resource r2 = new Resource("singh");
		new Thread(new Runnable(){public void run(){r1.bow(r2);}}).start();
		new Thread(new Runnable(){public void run(){r2.bow(r1);}}).start();	
		
		}
	}


	class Resource {
		String name;
		Resource (String name){
			this.name=name;
		}
		String getName(){
			return name;
		}
		
		synchronized  void bow(Resource r){
			System.out.println(r.getName()+" : "+name+" has bowed to me");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			r.bowBack(this);
			//System.out.println("never executes 1");
		}
		synchronized  void bowBack(Resource r){
			System.out.println(r.getName()+" : "+name+" has bowed back to me");
			//System.out.println("never executes 2");
		}
	}


