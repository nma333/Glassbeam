package fileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable {
	int i;
}

public class Serializationclass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		A obj = new A();
		obj.i = 100;

		// TODO Auto-generated method stub
		File f = new File("Newfile");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream dos = new ObjectOutputStream(fos);
		dos.writeObject(obj);

		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream dis = new ObjectInputStream(fis);
		A obj1 = (A) dis.readObject();

		System.out.println(obj1.i);

	}

}
