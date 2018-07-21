package innerClasses.nestedInterfaces;

public class TestNestedInterface2 implements Showable{  
	 public void show(){System.out.println("Hello nested interface in show method");}  
	  
	 public static void main(String args[]){  
	  Showable showable=new TestNestedInterface2();//upcasting here  
	  showable.show();  
	 }  
	}