package exceptions.errors;

public class ErrorAndException {
	
	public static void main (String []args){
		
		try{
			System.out.println("in the try block");
			throw new Error();
		}catch(Error e){
			System.out.println("caught the error");
			e.printStackTrace();
		}
	}

}
