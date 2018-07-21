package primitiveTypes;

public class PrimitiveTest {
	protected int protectedVar=0;
	private int privateVar=0;
	public int publicVar=0;
	int noModifierVar=0;
	public static void main (String [] args){
		double d=1.0000000000d;
		float f=1f;
		int i=1;
		byte b=127;
		long l=1;
		i=(int) d;
	//	d=i;
		f=(float) d;
		b=(byte) i;
		i=b;
		i=(int) l;
		if(d==f){
			System.out.println("Both d and f are equal");
		}
		if(i==f){
			System.out.println("Both i and f are equal");
		}
		System.out.println("d: "+d+"f: "+f);
	}
}
