package designPattern.decorator;

public abstract class IcecreamDecorator implements Icecream {
	Icecream icecream;
	IcecreamDecorator(Icecream icecream){
		this.icecream=icecream;
	}

}
