package exceptions;

class MyFinalException extends RuntimeException {
	String nameOfException;
	int num;
	MyFinalException(String s){
		nameOfException=s;
	}
	public String toString(){
		return nameOfException;
	}
	
	
}


public class ExceptionDemo1{
	public static void main (String [] args){
		try {
		int length= args.length;
		int b=1;
		//int c=b/length;
		System.out.println(length);
		
			throw new MyFinalException("exception is division by zero ");
		} catch (MyFinalException e) {
			
			e.printStackTrace();
		}
	}
}