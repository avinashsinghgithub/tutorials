package innerClasses.local;
public class localInner1{  
	 private int data2=30;//instance variable  
	 void display(){ 
		 int a=5;
	   class Local{ //private or public are not valid access specifier for local
		   			// inner class. even if the member are declared private 
		   			// they are accessible directly with dot operator
		 private int number=50;
		 private void msg(){System.out.println(data2+" local :" + a);}  
	  }  
	  Local l=new Local();  
	  l.msg();
	   System.out.println(l.number);
	 }  
	 
	 public static void main(String args[]){  
	  localInner1 obj=new localInner1();  
	  obj.display();  
	 }  
	 
}