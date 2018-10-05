package logos_copeFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File fCopyFrom = new File("copyFrom.txt");
		File fCopyTo = new File("copyTo.txt");
		fCopyFrom.createNewFile();
		fCopyTo.createNewFile();
		try (FileInputStream ff = new FileInputStream(fCopyFrom); 
				FileOutputStream ft = new FileOutputStream(fCopyTo)) {
			byte[] buffer = new byte[1024];
			int len;
			while ((len = ff.read(buffer)) != 0) {
				ft.write(buffer, 0, len);
			}

		} catch (IOException e) {

		}

		catch (IndexOutOfBoundsException e) {

		} catch (Exception e) {

		}

	}
}
