package ua.com.patern.factory_method;

/**
 * 
 * @author Kosovan Olexandr
 * @creator
 */
public class FactoryMethod_for_car {

	public Car getCar(Enum_cars enum_cars) {
		Car car = null;
		switch (enum_cars) {
		case TRUCK:
			car = new Truck();
			break;
		case BUS:
			car = new Bus();
			break;
		case SIMPLE_CAR:
			car = new Simple_car();
			break;
		default:
			System.err.println("error!!!");
			break;
		}
		return car;
	}
}
