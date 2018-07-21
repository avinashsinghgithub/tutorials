package inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritancetestWithObject {
	public static void main (String[] args){
		List a=null;
		method (null);
		methodWithAList(a);
//		a=new ArrayList();
//		a.add(1);
//		methodWithAList(a);
		methodWithAList(null);
		Object o=null;
		method(o);
		Object o1="avinash";
		method(o1);
		
	}
public static void method (Object o){
	System.out.println("method with Object parameter got called");
}
public static void method (String o){
	System.out.println("method with String parameter got called");
}

public static void methodWithAList (List o){
	System.out.println("method with List parameter got called");
}
public static void methodWithAList (ArrayList o){
	System.out.println("method with ArrayList parameter got called");
}
}
