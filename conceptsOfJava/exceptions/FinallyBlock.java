package exceptions;

public class FinallyBlock {
	public static void main(String args[]){
		System.out.println("the returned value is "+method());
	}
	
	static int  method(){
		try{
		return 1;
		}catch(Exception e){
			return 2;
		}finally{
			return 5;
		}
	}
}
