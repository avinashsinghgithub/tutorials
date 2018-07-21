package designPattern.decorator;

public class DecoratorTest {
	public static void main(String [] args){
		Icecream icecream= new NuttyIcecream(new NuttyIcecream(new SimpleIcecream()));
		System.out.println(icecream.makeIcecream());
	}

}
