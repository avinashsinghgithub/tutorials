package innerClasses.anonymous;
interface Eatable{  
	 void eat();  
	}  
public	class TestAnnonymousInnerUsingInterface{  
	 public static void main(String args[]){  
	 Eatable e=new Eatable(){  
	  public void eat(){System.out.println("nice fruits");}  
	 };  
	 e.eat();  
	 }  
	}  