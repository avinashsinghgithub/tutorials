package innerClasses;

class TestMemberOuter1{  
	 private int data=30;  
	 
	private class Inner{  
	  void msg(){
		  System.out.println("data is "+data);
		  }  
	   
	 }  
	 public class InnerWtihAVariable{
		  String name="inner class 2";
		  void demo(){
			  System.out.println("demo method");
			  }
		  }
	 public static void main(String args[]){  
	  TestMemberOuter1 obj=new TestMemberOuter1();  
	  TestMemberOuter1.Inner in=obj.new Inner();  
	  in.msg();
	  
	  TestInner tn= new TestInner();
	  tn.accessInnerOfOtherClass();
	   
	 }  
	} 

class TestInner{
	
	void accessInnerOfOtherClass(){

		TestMemberOuter1 test1= new TestMemberOuter1();
		TestMemberOuter1.InnerWtihAVariable in = test1.new InnerWtihAVariable();
		System.out.println(in.name);
}
}