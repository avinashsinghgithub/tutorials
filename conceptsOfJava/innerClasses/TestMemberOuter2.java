package innerClasses;

 class TestMemberOuter2{  
	 private int data=30;  
	 
	 class Inner{  // access specifier if changed to private this inner class can't
		 		   // be used outside this class. 
	  void msg(){
		  System.out.println("data is "+data);
		  }  
	 }  
	 public static void main (String [] args){
		 Test2  t= new Test2();
		 
		 t.testMethod(new TestMemberOuter2());
	 }
	} 
 class Test2 {
	void testMethod (TestMemberOuter2 t){
		TestMemberOuter2.Inner in= t.new Inner();// error will be thrown for a private 
		// inner class 
		in.msg();
	}
	
}

