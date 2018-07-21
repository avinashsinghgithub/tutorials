package constructors.sample1;

public class ConstructorDemo {

}
class A {
	int a;
	int b;
	int c;
	A(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
}
class B extends A {
	B(int a, int b, int c, int d,int e,int f) {
		super(a, b, c);
		this.d=d;
		this.e=e;
		this.f=f;
	}
	int d;
	int e;
	int f;
	
}