package strings;

public class StringDemo {



public static void main (String [] args){
	String name = "avinash";
	String name1=name;
	StringBuffer sBuffer =new StringBuffer("avinash");
	StringBuilder sBuilder= new StringBuilder("avinash");
	sBuilder.append("Kumar");
	sBuffer.append("Singh");
	System.out.println(name);
	System.out.println(name1);
	System.out.println(sBuffer);
	System.out.println(sBuilder);
}
}