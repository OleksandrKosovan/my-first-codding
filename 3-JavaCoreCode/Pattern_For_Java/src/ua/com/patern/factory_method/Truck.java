package ua.com.patern.factory_method;

public class Truck implements Car{

	@Override
	public void information() {
		System.out.println("This is truck");
	}

	@Override
	public void for_car() {
		System.out.println("Contain 2 persons");
	}

}
