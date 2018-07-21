package designPattern.decorator;

public class NuttyIcecream extends IcecreamDecorator {

	NuttyIcecream(Icecream icecream) {
		super(icecream);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeIcecream() {
		return icecream.makeIcecream()+addNuts();
		
	}
	String addNuts(){
		return "+nuts";
	}

}
