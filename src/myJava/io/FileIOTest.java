package myJava.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) throws IOException {
		// project根路径"./" project根路径的上一层"../"
		String dirPath = "assets/";
		File file = new File(dirPath);
		listAllFiles(file);

		String src = "assets/io/File/BUILDING.txt";
		String dist = "assets/io/File/copyBUILDING.txt";
		copyFile(src, dist);

		readFileContent(src);
	}

	public static void listAllFiles(File dir) {
		if (dir == null || !dir.exists()) {
			return;
		}
		if (dir.isFile()) {
			System.out.println(dir.getName());
			return;
		}
		for (File file : dir.listFiles()) {
			System.out.println(file.getPath());
			listAllFiles(file);
		}
	}

	public static void copyFile(String src, String dist) throws IOException {
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dist);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(in);
		byte[] buffer = new byte[20 * 1024];
		int cnt;

		// read() 最多读取 buffer.length 个字节
		// 返回的是实际读取的个数
		// 返回 -1 的时候表示读到 eof，即文件尾
		while ((cnt = bufferedInputStream.read(buffer, 0, buffer.length)) != -1) {
			out.write(buffer, 0, cnt);
		}

		in.close();
		out.close();
	}

	public static void readFileContent(String filePath) throws IOException {

		FileReader fileReader = new FileReader(filePath);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String line;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}

		// 装饰者模式使得 BufferedReader 组合了一个 Reader 对象
		// 在调用 BufferedReader 的 close() 方法时会去调用 Reader 的 close() 方法
		// 因此只要一个 close() 调用即可
		bufferedReader.close();
	}

}
