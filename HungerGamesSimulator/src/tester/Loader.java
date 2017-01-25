package tester;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Loader {

	public static void writeObject(Serializable s, String filename) throws IOException {
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.close();
	}
	
	public static Object readObject(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fos = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(fos);
		Object o = ois.readObject();
		ois.close();
		return o;
	}
	
}
