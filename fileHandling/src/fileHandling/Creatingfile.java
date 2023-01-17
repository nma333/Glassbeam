package fileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Creatingfile {

	public static void main(String[] args) throws Exception {
		File f = new File("today.txt");
		FileOutputStream fos = new FileOutputStream(f);
		@SuppressWarnings("resource")
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Hello Naveen !!!!");

		FileInputStream fis = new FileInputStream(f);
		@SuppressWarnings("resource")
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		System.out.println(str);

	}

}
