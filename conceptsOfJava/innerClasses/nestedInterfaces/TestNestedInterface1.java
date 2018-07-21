package innerClasses.nestedInterfaces;

interface Showable{  
	  void show();  
	   class Message{  
		   void msg(){}  
	  }  
	}  
	  
public	class TestNestedInterface1 extends Showable.Message{  
	 public void msg(){System.out.println("Hello nested interface");}  
	  
	 public static void main(String args[]){  
	  Showable.Message message=new TestNestedInterface1();//upcasting here  
	  message.msg();  
	 }  
	}


