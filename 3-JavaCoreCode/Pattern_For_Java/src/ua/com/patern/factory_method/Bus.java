package ua.com.patern.factory_method;

public class Bus implements Car {

	@Override
	public void information() {
		System.out.println("This is bus");
	}

	@Override
	public void for_car() {
		System.out.println("Contain 30 persons");
	}

	

}
