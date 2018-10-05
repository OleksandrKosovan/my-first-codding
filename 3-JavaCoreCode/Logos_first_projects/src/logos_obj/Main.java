package logos_obj;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Person<String, Integer> p = new Person<String, Integer>("anna", "takata", 25);

		// Person<String , String> p2=new Person<String, String>("anna",
		// "takata", " old");

		Class ref = p.getClass();

		Field field = ref.getDeclaredField("age");

		System.out.println(field.getType());
	}
}
