package finalKeyword;

/*final*/ class A {
	
final void m(){
	
}
}
class B extends A{//The type B cannot subclass the final class A
	
}
class C extends A{
	/*void m(){ //Cannot override the final method from A
		
	} */
}