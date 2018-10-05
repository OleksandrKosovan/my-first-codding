package ua.com.reflection.methods;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 
 * @author Kosovan Olexandr
 * @java Reflection API
 *
 */
public class Main {

	public static void main(String[] args) {

		/*
		 * getting information for class
		 */
		ClassMethods classMethods = new ClassMethods();
		Class class1 = classMethods.getClass();

		System.out.println(class1);
		// print "class ua.com.reflection.methods.ClassMethods"

		Class myclass = ClassMethods.class;
		System.out.println(myclass);
		// print "class ua.com.reflection.methods.ClassMethods"

		Class intclass = Integer.class;
		System.out.println(intclass);
		// print class java.lang.Integer

		/*
		 * getting name class
		 */
		Class c = classMethods.getClass();
		String s = c.getName();
		System.out.println(s);
		// print "ua.com.reflection.methods.ClassMethods"

		/*
		 * research modificator object
		 */
		Class cl = classMethods.getClass();
		int mods = cl.getModifiers();
		if (Modifier.isPublic(mods)) {
			System.out.println("public");
		}
		if (Modifier.isAbstract(mods)) {
			System.out.println("abstract");
		}
		if (Modifier.isFinal(mods)) {
			System.out.println("final");
		}
		// print public

		/*
		 * field study class
		 */
		Class koko = classMethods.getClass();
		Field[] publicFields = koko.getFields();
		for (Field field : publicFields) {
			Class fieldType = field.getType();
			System.out.println("Èìÿ: " + field.getName());
			System.out.println("Òèï: " + fieldType.getName());
		}
		// Èìÿ: price
		// Òèï: double

	}

}
