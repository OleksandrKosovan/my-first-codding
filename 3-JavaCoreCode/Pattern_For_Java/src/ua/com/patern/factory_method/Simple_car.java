package ua.com.patern.factory_method;

public class Simple_car implements Car {

	@Override
	public void information() {
		System.out.println("This is simple car");
	}

	@Override
	public void for_car() {
		System.out.println("Contain 4 persons");
	}

}
