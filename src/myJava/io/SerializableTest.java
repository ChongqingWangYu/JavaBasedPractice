package myJava.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		A a1 = new A(123, "abc");
		String objectFile = "assets/io/Serializable/a1";

		// 对象序列化存为文件
		FileOutputStream fos = new FileOutputStream(objectFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		oos.close();

		// 文件反序列化为对象
		FileInputStream fis = new FileInputStream(objectFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		A a2 = (A) ois.readObject();
		ois.close();
		System.out.println(a2);

	}

	private static class A implements Serializable {

		private int x;
		private String y;

		A(int x, String y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "x = " + x + "  " + "y = " + y;
		}
	}
}
