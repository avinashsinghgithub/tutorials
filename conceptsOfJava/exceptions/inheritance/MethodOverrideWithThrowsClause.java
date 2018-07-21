package exceptions.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import javax.annotation.processing.FilerException;

public class MethodOverrideWithThrowsClause {
	
	public static void main (String args []){
		
	}
	
	

}
class A{
	void demoMethod1() {
		System.out.print("demo method of A");
	}
	void demoMethod2()  throws SQLException,IOException,ClassNotFoundException{
		System.out.print("demo method of A");
	}
}

class B extends A{
	//Exception IOException is not compatible with throws clause in A.demoMethod()
	void demoMethod1() throws RuntimeException,NullPointerException {
		System.out.print("demo method of B");
	}
	void demoMethod2() throws SQLException,FileNotFoundException {
		System.out.print("demo method of B");
	}
}


class C extends A{
	//Exception IOException is not compatible with throws clause in A.demoMethod()
	void demoMethod1() throws RuntimeException {
		System.out.print("demo method of B");
	}
	void demoMethod2()  {
		System.out.print("demo method of B");
	}
}