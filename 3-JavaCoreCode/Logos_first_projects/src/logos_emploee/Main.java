package logos_emploee;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Emploee e1 = new Emploee("Mark", 1, 2500);
		Methods<Emploee> sd = new Methods<>();
		File file = new File("data.bin");
		try {

			sd.serialize(file, e1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Emploee e2 = sd.deserialize(file);
			System.out.println(e2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
