package logos_emploee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Methods<T> {

	public void serialize(File file, T object) throws IOException {
		FileOutputStream fo = new FileOutputStream(file);
		ObjectOutputStream so = new ObjectOutputStream(fo);
		so.writeObject(object);
		so.flush();
		so.close();

	}

	public Methods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public T deserialize(File file) throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream(file);
		ObjectInputStream si = new ObjectInputStream(fi);

		T readOb = (T) si.readObject();
		si.close();
		return readOb;

	}
}
