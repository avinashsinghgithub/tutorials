package inheritance;

import java.io.IOException;

public class StaticMethodOverride {
	public static void method(){
		System.out.println("In method of class A");
	}
	
	public static void main (String [] args){
		B.method();
	}
}
 class B extends StaticMethodOverride{
	public static void method (){// throws IOException can't be used as it 
		                  //would not be compatible with A.method() 
		System.out.println("In method of class B");
	}
	
	
}