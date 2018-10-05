package ua.com.patern.factory_method;

public class Main {

	public static void main(String[] args) {

		FactoryMethod_for_car method_for_car = new FactoryMethod_for_car();

		Car car = method_for_car.getCar(Enum_cars.BUS);
		car.information();
		car.for_car();

		Car car2 = method_for_car.getCar(Enum_cars.SIMPLE_CAR);
		car.information();
		car.for_car();

	}
}
