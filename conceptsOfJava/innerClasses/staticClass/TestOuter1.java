package innerClasses.staticClass;

public class TestOuter1{  
	  static int data=30;  
	  int number =1;
	  void msg(){
		  
	  }
	  static class Inner{
		  static int data=15;
		  int num=0;
	   void msg(){
		   System.out.println("data is "+data);
		   System.out.println("data is "+TestOuter1.data);
		   System.out.println("data is "+num);
		  // System.out.println("data is "+number);//wont work
		    }  
	  }  
	  public static void main(String args[]){  
	  TestOuter1.Inner obj=new TestOuter1.Inner();  
	  obj.msg();
	  System.out.println(TestOuter1.Inner.data);
	  }  
	}  