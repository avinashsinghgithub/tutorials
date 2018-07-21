package innerClasses.anonymous;

abstract class Person{  
	  abstract void eat();  
	}  
	public class TestAnonymousInner{  
	 public static void main(String args[]){  
	  Person p=new Person(){  
		  void eat(){
			  System.out.println("nice fruits");
		  }  
	  }; 
	  Person p1=new Person(){  
		  @Override
		  void eat(){
			  System.out.println("nice job");
			  sleep();
		  }

		
		void sleep() {
			 System.out.println("going to sleep");
			// TODO Auto-generated method stub
			
		}  
	  };
	  p.eat();  
	  p1.eat(); 
	  //p1.sleep();	// error will be thrown
	  				// "The method sleep() is undefined for the type Person"
	 }  
	}  