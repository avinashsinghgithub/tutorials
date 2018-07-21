package primitiveTypes;
import primitiveTypes.PrimitiveTest; 
public class A {
	public static void main (String [] args){
	PrimitiveTest p = new PrimitiveTest();
	System.out.println(p.publicVar);
	System.out.println(p.protectedVar);//accessible inside package
	//System.out.println(p.privateVar);//The field PrimitiveTest.privateVar is not visible
	System.out.println(p.noModifierVar);
	}
}
 class B extends PrimitiveTest{
	public static void main (String [] args){
	B b = new B();
	System.out.println(b.publicVar);
	System.out.println(b.protectedVar);//accessible inside package
	//System.out.println(b.privateVar);//The field PrimitiveTest.privateVar is not visible
	System.out.println(b.noModifierVar);
	}
}
