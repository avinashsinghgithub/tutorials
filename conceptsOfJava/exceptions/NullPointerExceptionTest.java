package exceptions;

import java.util.List;

public class NullPointerExceptionTest {
	public static void main(String[] args ){
	List list =null;//= new ArrayList();
	//list.add(1);
	throw new NullPointerException();
	//throw new MyFinalException("test");
	}
}
