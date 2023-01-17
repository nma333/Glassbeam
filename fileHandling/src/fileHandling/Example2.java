package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class B implements Serializable {
	private int rn;
	private String name;
	private double marks;

	public B(int rn, String name, double marks) {
		super();
		this.rn = rn;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return rn + " " + name + " " + marks;
	}
}

public class Example2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("Second");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream dos = new ObjectOutputStream(fos);
		B obj = new B(1, "Naveen", 91.36);
		B o1=new B(2,"Virat",92);
		dos.writeObject(obj);
		dos.writeObject(o1);

		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream dis = new ObjectInputStream(fis);
		B obj1 = (B) dis.readObject();
		B obj2=(B) dis.readObject();

		System.out.println(obj1);
		System.out.println(obj2);

	}

}
