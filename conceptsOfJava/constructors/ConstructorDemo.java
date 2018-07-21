package constructors;

public class ConstructorDemo {
	public static void main (String[] args){
		A a = new A(1,2,3);
		B b = new B(1,2,3,4,5,6);
		//System.out.println(b.a);// won't work
	b.displayPrivateInstances();
	}

}
class A {
	private int a;
	private int b;
	private int c;
	 A(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void displayPrivateInstances(){
		System.out.println("a is: "+a+" b is : "+b+" c is : "+c);
	}
}
class B extends A {
	B(int a, int b, int c, int d,int e,int f) {
		super(a,b,c);
		this.d=d;
		this.e=e;
		this.f=f;
	}
	
	int d;
	int e;
	int f;
	
}