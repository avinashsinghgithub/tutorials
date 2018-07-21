package packageTest;
import primitiveTypes.PrimitiveTest; 
class A {
	public static void main (String [] args){
	PrimitiveTest p = new PrimitiveTest();
	System.out.println(p.publicVar);
	//System.out.println(p.protectedVar);//The field PrimitiveTest.protectedVar is not visible
	//System.out.println(p.privateVar);//The field PrimitiveTest.privateVar is not visible
	//System.out.println(p.noModifierVar);//The field PrimitiveTest.noModifierVar is not visible
	}
}

class B extends PrimitiveTest {
	public static void main (String [] args){
	//PrimitiveTest p = new PrimitiveTest();
		B b= new B();
	System.out.println(b.publicVar);
	System.out.println(b.protectedVar);
	//System.out.println(b.privateVar);//The field PrimitiveTest.privateVar is not visible
	//System.out.println(b.noModifierVar);//The field PrimitiveTest.noModifierVar is not visible
	}
}
